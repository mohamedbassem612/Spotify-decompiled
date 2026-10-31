package p;

import android.os.Parcelable;
import androidx.recyclerview.widget.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nx11 implements rjp0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ox11 b;

    public /* synthetic */ nx11(ox11 ox11Var, byte b) {
        this.a = b;
        this.b = ox11Var;
    }

    public final void b(Object obj) {
        a layoutManager;
        byte b = this.a;
        ox11 ox11Var = this.b;
        switch (b) {
            case 0:
                rnc0 rnc0Var = (rnc0) obj;
                List list = rnc0Var.b;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!(((h8k1) it.next()).a instanceof wx11)) {
                            ox11Var.e.b(rnc0Var);
                            if (ox11Var.g) {
                                ox11Var.g = false;
                                Parcelable parcelable = ox11Var.f;
                                if (parcelable != null && (layoutManager = ox11Var.d.getLayoutManager()) != null) {
                                    layoutManager.w0(parcelable);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                sx11 sx11Var = (sx11) obj;
                if (sx11Var instanceof px11) {
                    if (ox11Var.h) {
                        ox11Var.h = false;
                        ox11Var.d.post(new xfz0(ox11Var, (byte) 4));
                    }
                    if (!((px11) sx11Var).a.b.isEmpty()) {
                        ox11Var.a.post(new jyh0(ox11Var, sx11Var, (byte) 15));
                    }
                }
                break;
        }
    }
}
