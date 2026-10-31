package p;

import android.R;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a45 {
    public final b45 a;
    public final y35 b;
    public final y35 c;
    public final View d;

    public a45(b45 b45Var, y35 y35Var, y35 y35Var2, View view) {
        this.a = b45Var;
        this.b = y35Var;
        this.c = y35Var2;
        this.d = view;
    }

    public final boolean a(Menu menu) {
        int i;
        f3e1 f3e1Var = (f3e1) this.b.invoke();
        byte b = 0;
        if (u890.j(f3e1Var, (Object) null)) {
            return false;
        }
        menu.clear();
        List list = f3e1Var.a;
        int size = list.size();
        int i2 = 1;
        int i3 = 1;
        for (int i4 = 0; i4 < size; i4++) {
            e3e1 e3e1Var = (e3e1) list.get(i4);
            if (e3e1Var instanceof m3e1) {
                int i5 = i2 + 1;
                Object obj = e3e1Var.a;
                if (u890.j(obj, eko1.a)) {
                    i = R.id.cut;
                } else if (u890.j(obj, eko1.b)) {
                    i = R.id.copy;
                } else if (u890.j(obj, eko1.c)) {
                    i = R.id.paste;
                } else if (u890.j(obj, eko1.d)) {
                    i = R.id.selectAll;
                } else {
                    i = u890.j(obj, eko1.e) ? R.id.autofill : i2;
                }
                m3e1 m3e1Var = (m3e1) e3e1Var;
                MenuItem menuItemAdd = menu.add(i3, i, i2, m3e1Var.b);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new z35(m3e1Var, this, b));
                i2 = i5;
            } else if (e3e1Var instanceof s3e1) {
                if (Build.VERSION.SDK_INT >= 28) {
                    s3e1 s3e1Var = (s3e1) e3e1Var;
                    ph5.a(menu, i2, this.d.getContext(), s3e1Var.b, s3e1Var.c, s3e1Var.d);
                    i2++;
                }
            } else if (e3e1Var instanceof q3e1) {
                i3++;
            }
        }
        return true;
    }
}
