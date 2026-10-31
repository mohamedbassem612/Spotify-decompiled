package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class doa0 extends vln0 {
    public static final Parcelable.Creator<doa0> CREATOR = new jca0((byte) 2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p.t1f0
    public final String j() {
        return "katana_proxy_auth";
    }

    @Override // p.t1f0
    public final int t(rye0 rye0Var) {
        boolean z;
        boolean z2 = wf10.o && dro.z() != null && g5d0.c(rye0Var.a);
        String strM = mod.m();
        h().j();
        String str = rye0Var.d;
        Set set = rye0Var.b;
        Set set2 = set;
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            String str2 = (String) it.next();
            lfb lfbVar = s1f0.b;
            if (lfb.g(str2)) {
                z = true;
                break;
            }
        }
        int i = rye0Var.c;
        int i2 = i == 0 ? 1 : i;
        String strG = g(rye0Var.g);
        String str3 = rye0Var.t;
        String str4 = rye0Var.Y;
        boolean z3 = rye0Var.Z;
        boolean z4 = rye0Var.O0;
        boolean z5 = rye0Var.P0;
        String str5 = rye0Var.Q0;
        int i3 = rye0Var.T0;
        if (i3 != 0) {
            ktd.u(i3);
        }
        String str6 = rye0Var.e;
        String str7 = rye0Var.f;
        omn0 omn0Var = omn0.a;
        ArrayList<Intent> arrayList = null;
        if (!dhn.a.contains(omn0.class)) {
            try {
                ArrayList arrayList2 = omn0.b;
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    boolean z6 = z4;
                    String str8 = str5;
                    String str9 = str6;
                    boolean z7 = z5;
                    boolean z8 = z3;
                    Intent intentC = omn0.a.c((nmn0) it2.next(), str, set2, strM, z, i2, strG, str3, z2, str4, z8, 1, z6, z7, str8, str9, str7);
                    if (intentC != null) {
                        arrayList3.add(intentC);
                    }
                    z3 = z8;
                    z4 = z6;
                    z5 = z7;
                    str5 = str8;
                    str6 = str9;
                }
                arrayList = arrayList3;
            } catch (Throwable th) {
                dhn.a(omn0.class, th);
            }
        }
        a("e2e", strM);
        int i4 = 0;
        for (Intent intent : arrayList) {
            i4++;
            z5c.c(1);
            if (K(intent)) {
                return i4;
            }
        }
        return 0;
    }
}
