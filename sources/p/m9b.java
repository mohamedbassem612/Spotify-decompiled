package p;

import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m9b implements ba6 {
    public final Resources a;
    public final bn70 b;
    public final String c;
    public final boolean d;
    public final fqh1 e;

    public m9b(Resources resources, u9b u9bVar) {
        this.a = resources;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.b = new bn70(yon1.G1("BLUEJAY_CREATE", "bluejay/create", 229, "bluejay"), nik1.q6, (nar0) null);
        this.c = resources.getString(2131952857);
        this.d = u9bVar.a.h();
        this.e = new fqh1(resources.getString(2131952948), resources.getString(2131952946), resources.getString(2131952945), resources.getString(2131952947));
    }

    public final String b(psk pskVar) {
        int i = l9b.a[pskVar.ordinal()];
        Resources resources = this.a;
        return i == 1 ? resources.getString(2131952856) : resources.getString(2131952855);
    }

    public final fqh1 c() {
        return this.e;
    }

    public final String d() {
        return this.c;
    }

    public final boolean e(y86 y86Var, String str) {
        if (!str.equals(y86Var.d)) {
            return true;
        }
        xw51 xw51Var = y86Var.x;
        String str2 = xw51Var != null ? xw51Var.a : null;
        xw51 xw51Var2 = y86Var.y;
        return (u890.j(str2, xw51Var2 != null ? xw51Var2.a : null) && u890.j(y86Var.z, y86Var.A) && u890.j(y86Var.l, y86Var.m) && !y86Var.F && !(y86Var.B instanceof zk7)) ? false : true;
    }

    public final String f(psk pskVar, boolean z) {
        int i = l9b.a[pskVar.ordinal()];
        Resources resources = this.a;
        return i == 1 ? resources.getString(2131952854) : resources.getString(2131952852);
    }

    public final String g(psk pskVar, boolean z, boolean z2) {
        psk pskVar2 = psk.c;
        Resources resources = this.a;
        if (pskVar == pskVar2) {
            String string = resources.getString(2131952854);
            string.getClass();
            return string;
        }
        if (!z2) {
            return f(pskVar, z);
        }
        String string2 = resources.getString(2131952853);
        string2.getClass();
        return string2;
    }

    public final bn70 getIdentifier() {
        return this.b;
    }

    public final boolean h() {
        return true;
    }

    public final upx0 i() {
        return tpx0.a;
    }

    public final boolean j() {
        return this.d;
    }
}
