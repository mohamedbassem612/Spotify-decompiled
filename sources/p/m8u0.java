package p;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m8u0 {
    public static final m8u0 b = new l8u0().d();
    public static final String c;
    public final ko20 a;

    static {
        String str = zoi1.a;
        c = Integer.toString(0, 36);
    }

    public m8u0(ko20 ko20Var) {
        this.a = ko20Var;
    }

    public static m8u0 b(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(c);
        if (integerArrayList == null) {
            return b;
        }
        l8u0 l8u0Var = new l8u0();
        for (int i = 0; i < integerArrayList.size(); i++) {
            l8u0Var.a(integerArrayList.get(i).intValue());
        }
        return l8u0Var.d();
    }

    public final boolean a(int i) {
        return this.a.a.get(i);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            ko20 ko20Var = this.a;
            if (i >= ko20Var.a.size()) {
                bundle.putIntegerArrayList(c, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(ko20Var.b(i)));
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m8u0) {
            return this.a.equals(((m8u0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
