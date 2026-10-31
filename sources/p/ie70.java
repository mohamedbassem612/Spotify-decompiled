package p;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ie70 {
    public final s470 a;
    public final s470 b;
    public final kz50 c;
    public final w470 d;
    public final HashSet e;

    public ie70(l670 l670Var, w470 w470Var) {
        s470 s470Var = new s470(l670Var);
        s470 s470Var2 = new s470(l670Var, null);
        kz50 kz50Var = new kz50(l670Var);
        w470Var.getClass();
        this.d = w470Var;
        this.a = s470Var;
        this.b = s470Var2;
        this.c = kz50Var;
        this.e = new HashSet();
        w470Var.d().setAdapter(s470Var2);
        w470Var.i(kz50Var);
        rd70 rd70Var = rd70.c;
    }

    public final void a(Parcelable parcelable) {
        if (parcelable instanceof he70) {
            he70 he70Var = (he70) parcelable;
            this.d.g(he70Var.a);
            Parcelable parcelable2 = he70Var.b;
            t470 t470Var = this.a.f;
            t470Var.t(parcelable2, (WeakHashMap) ((yfu) t470Var).b);
            Parcelable parcelable3 = he70Var.c;
            t470 t470Var2 = this.b.f;
            t470Var2.t(parcelable3, (WeakHashMap) ((yfu) t470Var2).b);
            Parcelable parcelable4 = he70Var.d;
            t470 t470Var3 = (t470) this.c.b;
            t470Var3.t(parcelable4, (WeakHashMap) ((yfu) t470Var3).b);
        }
    }

    public final he70 b() {
        Bundle bundle;
        Parcelable parcelable;
        Bundle bundle2;
        Parcelable parcelable2;
        Parcelable parcelableH = this.d.h();
        t470 t470Var = this.a.f;
        WeakHashMap weakHashMap = (WeakHashMap) ((yfu) t470Var).b;
        Parcelable parcelable3 = null;
        if (weakHashMap.isEmpty()) {
            bundle = null;
        } else {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            f670 f670Var = ((b570) t470Var.e).d;
            for (int i = 0; i < f670Var.size(); i++) {
                y570 y570Var = (y570) ((b570) f670Var.b).b.get(i);
                y570Var.getClass();
                String strA = y570Var.a();
                if (strA != null && (parcelable = (Parcelable) weakHashMap.get(strA)) != null) {
                    sparseArray.put(i, parcelable);
                }
            }
            bundle = new Bundle();
            bundle.putSparseParcelableArray("hubs_adapter_states", sparseArray);
        }
        t470 t470Var2 = this.b.f;
        WeakHashMap weakHashMap2 = (WeakHashMap) ((yfu) t470Var2).b;
        if (weakHashMap2.isEmpty()) {
            bundle2 = null;
        } else {
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            f670 f670Var2 = ((b570) t470Var2.e).d;
            for (int i2 = 0; i2 < f670Var2.size(); i2++) {
                y570 y570Var2 = (y570) ((b570) f670Var2.b).b.get(i2);
                y570Var2.getClass();
                String strA2 = y570Var2.a();
                if (strA2 != null && (parcelable2 = (Parcelable) weakHashMap2.get(strA2)) != null) {
                    sparseArray2.put(i2, parcelable2);
                }
            }
            bundle2 = new Bundle();
            bundle2.putSparseParcelableArray("hubs_adapter_states", sparseArray2);
        }
        t470 t470Var3 = (t470) this.c.b;
        WeakHashMap weakHashMap3 = (WeakHashMap) ((yfu) t470Var3).b;
        kz50 kz50Var = (kz50) t470Var3.e;
        y570 y570Var3 = (y570) kz50Var.g;
        if (y570Var3 != null && y570Var3.a() != null) {
            parcelable3 = (Parcelable) weakHashMap3.get(((y570) kz50Var.g).a());
        }
        return new he70(parcelableH, bundle, bundle2, parcelable3);
    }

    public final void c(re70 re70Var) {
        kz50 kz50Var = this.c;
        zsc zscVar = (zsc) kz50Var.a;
        boolean zIsEmpty = re70Var.k().isEmpty();
        s470 s470Var = this.a;
        w470 w470Var = this.d;
        if (!zIsEmpty && w470Var.c().getAdapter() == null) {
            w470Var.c().setAdapter(s470Var);
        }
        s470Var.B(re70Var.k());
        y570 y570VarL = re70Var.l();
        if (y570VarL == null) {
            uo5 uo5Var = (uo5) kz50Var.c;
            ((IdentityHashMap) uo5Var.c).clear();
            ((IdentityHashMap) uo5Var.d).clear();
            ((WeakHashMap) ((yfu) ((t470) kz50Var.b)).b).clear();
            pe70 pe70Var = (pe70) kz50Var.f;
            if (pe70Var != null) {
                zscVar.F(pe70Var);
                kz50Var.f = null;
            }
        }
        kz50Var.g = y570VarL;
        List listJ = re70Var.j();
        s470 s470Var2 = this.b;
        s470Var2.B(listJ);
        w470Var.f(re70Var);
        s470Var.h();
        s470Var2.h();
        uo5 uo5Var2 = (uo5) zscVar.d;
        ((IdentityHashMap) uo5Var2.c).clear();
        ((IdentityHashMap) uo5Var2.d).clear();
        ((oc70) kz50Var.d).a();
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            throw pze0.g(it);
        }
    }
}
