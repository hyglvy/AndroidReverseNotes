package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.R;

public class PreferenceInfoCategory extends Preference {
    public OnClickListener yDo;
    public OnClickListener yDp;
    public int yfj;

    public PreferenceInfoCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceInfoCategory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AppMethodBeat.i(107281);
        this.yDo = null;
        this.yDp = null;
        this.yfj = 0;
        setLayoutResource(R.layout.afr);
        AppMethodBeat.o(107281);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBindView(View view) {
        AppMethodBeat.i(107282);
        super.onBindView(view);
        TextView textView = (TextView) view.findViewById(16908310);
        if (textView == null) {
            AppMethodBeat.o(107282);
            return;
        }
        if (getTitle() == null || getTitle().length() <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(getTitle());
            textView.setOnClickListener(this.yDp);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.da8);
        imageView.setOnClickListener(this.yDo);
        if (this.yfj > 0) {
            imageView.setImageResource(this.yfj);
        }
        AppMethodBeat.o(107282);
    }
}
