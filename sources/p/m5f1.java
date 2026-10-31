package p;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.spotify.collection2.itemdata.proto.CollectionItemdata$ItemData;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m5f1 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public final Object g;

    public m5f1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.d = layoutParams;
        this.e = new Rect();
        this.f = new int[2];
        this.g = new int[2];
        this.a = context;
        View viewInflate = LayoutInflater.from(context).inflate(2131623963, (ViewGroup) null);
        this.b = viewInflate;
        this.c = (TextView) viewInflate.findViewById(2131429964);
        layoutParams.setTitle(m5f1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = CollectionItemdata$ItemData.BAN_ITEM_DATA_FIELD_NUMBER;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2132017179;
        layoutParams.flags = 24;
    }

    public void a() {
        int i;
        Iterator it = ((ArrayList) this.e).iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 1;
                break;
            }
            t5o0 t5o0Var = (t5o0) it.next();
            int i2 = t5o0Var.c.c;
            i = 3;
            if (i2 == 3 || (i2 == 2 && t5o0Var.e == 0)) {
                break;
            }
        }
        m5k m5kVar = (m5k) this.a;
        if (i != m5kVar.c) {
            m5kVar.y(i);
        }
    }

    public int b(t5o0 t5o0Var) {
        t5o0 t5o0Var2;
        Iterator it = ((ArrayList) this.e).iterator();
        int i = 0;
        while (it.hasNext() && (t5o0Var2 = (t5o0) it.next()) != t5o0Var) {
            i += t5o0Var2.e;
        }
        return i;
    }

    public iti1 c(int i) {
        iti1 iti1Var = (iti1) this.f;
        if (iti1Var.a) {
            iti1Var = new iti1((char) 0);
        } else {
            iti1Var.a = true;
        }
        int i2 = i;
        for (t5o0 t5o0Var : (ArrayList) this.e) {
            int i3 = t5o0Var.e;
            if (i3 > i2) {
                iti1Var.c = t5o0Var;
                iti1Var.b = i2;
                break;
            }
            i2 -= i3;
        }
        if (((t5o0) iti1Var.c) != null) {
            return iti1Var;
        }
        hhg1.n(f4i1.c(i, "Cannot find wrapper for "));
        return null;
    }

    public t5o0 d(w611 w611Var) {
        t5o0 t5o0Var = (t5o0) ((IdentityHashMap) this.d).get(w611Var);
        if (t5o0Var != null) {
            return t5o0Var;
        }
        ncn0.f("Cannot find wrapper for ", w611Var, ", seems like it is not bound by this adapter: ", this);
        return null;
    }

    public int e(z511 z511Var) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((t5o0) arrayList.get(i)).c == z511Var) {
                return i;
            }
        }
        return -1;
    }

    public m5f1(m5k m5kVar, wdu0 wdu0Var) {
        this.c = new ArrayList();
        this.d = new IdentityHashMap();
        this.e = new ArrayList();
        this.f = new iti1((char) 0);
        this.a = m5kVar;
        this.b = new jw91((byte) 2);
        this.g = new y281((byte) 12);
    }
}
