package p;

import android.content.Context;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ctc1 extends x9a {
    public final Context b;
    public final String c;
    public final rg7 d;
    public final r87 e;
    public final vz01 f;
    public final lfb g;
    public final v4c h;
    public final pud i;

    public ctc1(Context context, String str, fjb fjbVar, rg7 rg7Var, r87 r87Var, vz01 vz01Var, lfb lfbVar) {
        super(fjbVar);
        this.b = context;
        this.c = str;
        this.d = rg7Var;
        this.e = r87Var;
        this.f = vz01Var;
        this.g = lfbVar;
        this.h = new v4c(this, (byte) 2);
        this.i = pud.SUGGESTED_EPISODES;
    }

    @Override // p.x9a
    public final List a() {
        return Collections.singletonList(gn90.b);
    }

    @Override // p.x9a
    public final pud e() {
        return this.i;
    }

    @Override // p.x9a
    public final jvd f() {
        return this.h;
    }

    @Override // p.x9a
    public final boolean g(List list) {
        List<String> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        for (String str : list2) {
            Set set = s4b1.f;
            if (!uic.g(str, blc0.Pg)) {
                return false;
            }
        }
        return true;
    }

    @Override // p.x9a
    public final boolean k(il51 il51Var) {
        return !il51Var.b;
    }
}
