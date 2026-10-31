package p;

import android.graphics.Typeface;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class jj5 implements dkl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jj5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                kj5.a((kj5) obj2, (Typeface) obj);
                break;
            case 1:
                AppCompatEditText.c((AppCompatEditText) obj2, (Typeface) obj);
                break;
            case 2:
                AppCompatTextView.l((AppCompatTextView) obj2, (Typeface) obj);
                break;
            case 3:
                o29 o29Var = (o29) obj;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    int i = o29Var.b - ((o19) entry.getKey()).f;
                    if (((o19) entry.getKey()).g) {
                        i = -i;
                    }
                    int iF = pfg1.f(i);
                    n3d1 n3d1Var = (n3d1) entry.getValue();
                    n3d1Var.getClass();
                    w8p1.y(new jym0(n3d1Var, iF, -1, (byte) 2));
                }
                break;
            case 4:
                k65 k65Var = (k65) obj2;
                j2h1.o("SurfaceViewImpl");
                if (k65Var != null) {
                    k65Var.a();
                }
                break;
            default:
                ((mzc) obj2).b((n29) obj);
                break;
        }
    }
}
