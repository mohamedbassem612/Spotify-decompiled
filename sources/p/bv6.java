package p;

import android.os.Bundle;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bv6 extends x7e0 implements b031 {
    public su6 N0;
    public final bpb1 O0;
    public xab1 X;
    public y0r Y;
    public boolean Z;
    public final d0r d;
    public final em0 e;
    public final String f;
    public final boolean g;
    public final u9c0 h;
    public final bpb1 i;
    public final xe01 t;

    public bv6(d0r d0rVar, em0 em0Var, String str, boolean z, u9c0 u9c0Var) {
        b3s b3sVar = b3s.c;
        this.d = d0rVar;
        this.e = em0Var;
        this.f = str;
        this.g = z;
        this.h = u9c0Var;
        bpb1 bpb1VarB = gio1.b(new su6(null, 0, 0, null, null, null, 0, null, 4095));
        this.i = bpb1VarB;
        this.t = d5p1.h(bpb1VarB);
        this.O0 = gio1.b(Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    public final void a(Bundle bundle) {
        jx11 jx11VarW;
        Object next;
        em0 em0Var = this.e;
        hrr0 hrr0Var = (hrr0) em0Var.d;
        String string = bundle.getString("selected_mode");
        if (string != null) {
            Iterator it = jx11.f.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((jx11) next).name(), string));
            jx11VarW = (jx11) next;
            if (jx11VarW == null) {
                jx11VarW = em0Var.W();
            }
        } else {
            jx11VarW = em0Var.W();
        }
        Bundle bundle2 = bundle.containsKey("selected_tag_id") ? bundle : null;
        Integer numValueOf = bundle2 != null ? Integer.valueOf(bundle2.getInt("selected_tag_id")) : null;
        g3d0 g3d0Var = (g3d0) jhc1.t(bundle, "sort_order", g3d0.class);
        ((hrr0) em0Var.c).setValue(jx11VarW);
        hrr0Var.setValue(numValueOf);
        ((hrr0) em0Var.e).setValue(g3d0Var);
        bpb1 bpb1Var = (bpb1) em0Var.f;
        Integer num = (Integer) hrr0Var.getValue();
        bpb1Var.m((Object) null, new vfm0(jx11VarW, num != null ? Collections.singleton(new irc0(Collections.singleton(Integer.valueOf(num.intValue())))) : w7x.a, g3d0Var));
        ((bpb1) em0Var.t).m((Object) null, nhc1.W(em0Var.W().a, "{id}", (String) em0Var.b));
    }

    public final void e() {
        if (d()) {
            return;
        }
        this.Z = false;
        j();
        this.X = fn31.T(this.h, (o8n) null, 0, new vk6(this, null, (byte) 2), 3);
    }

    public final void f() {
        xab1 xab1Var = this.X;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.X = null;
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        em0 em0Var = this.e;
        bundle.putString("selected_mode", em0Var.W().name());
        Integer num = (Integer) ((hrr0) em0Var.d).getValue();
        if (num != null) {
            bundle.putInt("selected_tag_id", num.intValue());
        }
        bundle.putParcelable("sort_order", (g3d0) ((hrr0) em0Var.e).getValue());
        return bundle;
    }
}
