package p;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.spotify.encoremobile.component.textview.EncoreTextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class pca extends EncoreTextView {
    public pca(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0, 4, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.textAppearance, R.attr.textColor});
        cf91 cf91Var = new cf91(typedArrayObtainStyledAttributes.getResourceId(0, R.style.TextAppearance.Material), typedArrayObtainStyledAttributes.getColor(1, 0));
        typedArrayObtainStyledAttributes.recycle();
        if (cf91Var.a() == 16974317) {
            setTextAppearance(i);
        }
        if (cf91Var.b() != 0) {
            setTextColor(cf91Var.b());
        }
    }
}
