package p;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zq31 implements mj8 {
    public final ImageButton a;

    public zq31(Context context) {
        this.a = (ImageButton) View.inflate(context, 2131626329, null);
    }

    public final void f(Object obj) {
        int i;
        int i2;
        int iOrdinal = ((lj8) obj).a.ordinal();
        if (iOrdinal == 0) {
            i = 2131231078;
            i2 = 2131954535;
        } else if (iOrdinal == 1) {
            i = 2131231074;
            i2 = 2131962510;
        } else if (iOrdinal != 2) {
            i2 = 2131954529;
            i = 2131231073;
            if (iOrdinal == 5 || iOrdinal == 7 || iOrdinal != 8) {
            }
        } else {
            i = 2131231076;
            i2 = 2131954530;
        }
        ImageButton imageButton = this.a;
        imageButton.setImageResource(i);
        imageButton.setContentDescription(imageButton.getContext().getString(i2));
    }

    public final View getView() {
        return this.a;
    }

    public final void n(iu30 iu30Var) {
        this.a.setOnClickListener(new jn90(iu30Var, (byte) 29));
    }
}
