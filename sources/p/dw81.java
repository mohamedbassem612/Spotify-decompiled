package p;

import android.content.res.Resources;
import android.media.MediaCodecInfo;
import android.view.View;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dw81 extends hab0 implements iu30 {
    public static final dw81 N0;
    public static final dw81 O0;
    public static final dw81 P0;
    public static final dw81 Q0;
    public static final dw81 R0;
    public static final dw81 S0;
    public static final dw81 T0;
    public static final dw81 U0;
    public static final dw81 V0;
    public static final dw81 W0;
    public static final dw81 X;
    public static final dw81 X0;
    public static final dw81 Y;
    public static final dw81 Y0;
    public static final dw81 Z;
    public static final dw81 Z0;
    public static final dw81 a1;
    public static final dw81 b;
    public static final dw81 c;
    public static final dw81 d;
    public static final dw81 e;
    public static final dw81 f;
    public static final dw81 g;
    public static final dw81 h;
    public static final dw81 i;
    public static final dw81 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new dw81(i2, (byte) 0);
        c = new dw81(i2, (byte) 1);
        d = new dw81(i2, (byte) 2);
        e = new dw81(i2, (byte) 3);
        f = new dw81(i2, (byte) 4);
        g = new dw81(i2, (byte) 5);
        h = new dw81(i2, (byte) 6);
        i = new dw81(i2, (byte) 7);
        t = new dw81(i2, (byte) 8);
        X = new dw81(i2, (byte) 9);
        Y = new dw81(i2, (byte) 10);
        Z = new dw81(i2, (byte) 11);
        N0 = new dw81(i2, (byte) 12);
        O0 = new dw81(i2, (byte) 13);
        P0 = new dw81(i2, (byte) 14);
        Q0 = new dw81(i2, (byte) 15);
        R0 = new dw81(i2, (byte) 16);
        S0 = new dw81(i2, (byte) 17);
        T0 = new dw81(i2, (byte) 18);
        U0 = new dw81(i2, (byte) 19);
        V0 = new dw81(i2, (byte) 20);
        W0 = new dw81(i2, (byte) 21);
        X0 = new dw81(i2, (byte) 22);
        Y0 = new dw81(i2, (byte) 23);
        Z0 = new dw81(i2, (byte) 24);
        a1 = new dw81(i2, (byte) 25);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dw81(Object obj, byte b2) {
        super(1);
        this.a = b2;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = false;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                fw81 fw81Var = (fw81) obj;
                return new wfq0(fw81Var.c(), fw81Var.a());
            case 1:
                return b7xVar;
            case 2:
                return b7xVar;
            case 3:
                return b7xVar;
            case 4:
                ((Boolean) obj).getClass();
                return rih1Var;
            case 5:
                return Boolean.valueOf(!((v0a0) obj).a.isEmpty());
            case 6:
                hi hiVar = (hi) obj;
                ArrayList arrayList = wfa1.i;
                return new qcr(hiVar, new mj(2131963047, l7c.i(hiVar), 2131963042, 33, l7c.f(hiVar), (String) null));
            case 7:
                return ((ContextTrack) ((PlayerState) obj).track().b()).uri();
            case 8:
                return Boolean.valueOf(!((MediaCodecInfo) obj).isEncoder());
            case 9:
                l0l l0lVar = (l0l) obj;
                if (l0lVar != null) {
                    return l0lVar.d();
                }
                return null;
            case 10:
                return Boolean.valueOf((((Resources) obj).getConfiguration().uiMode & 48) == 32);
            case 11:
                List listA = ((pdf1) obj).a();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    String strA = ((sdf1) it.next()).a();
                    if (strA != null) {
                        arrayList2.add(strA);
                    }
                }
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new gef1((String) it2.next()));
                }
                return arrayList3;
            case 12:
                lvf1 lvf1Var = (lvf1) obj;
                if (!lvf1Var.a && !lvf1Var.c) {
                    if (!lvf1Var.e) {
                        if (!lvf1Var.d) {
                            if (!lvf1Var.b) {
                                return l6u.a;
                            }
                        }
                    }
                    return j6u.a;
                }
                return m6u.a;
            case 13:
                return (String) obj;
            case 14:
                if (nzg1.a[((i511) obj).ordinal()] == 1) {
                    return kzg1.a;
                }
                eg.o();
                return null;
            case 15:
                ((Number) obj).intValue();
                return r6h1.c;
            case 16:
                return new mjl0((owl0) obj).h();
            case 17:
                return d6j1.b((n6j1) obj);
            case 18:
                return ((n6j1) obj).a();
            case 19:
                return b7xVar;
            case 20:
                return new z7l1((y7l1) obj);
            case 21:
                b261.d((e261) obj);
                return rih1Var;
            case 22:
                return new qcr((hi) obj, new mj(2131963048, 2131963038, 2131963043, 33, "https://spotify-tap.spotifycdn.com/onboarding/jabra/jabra_tap_animation.json", (String) null));
            case 23:
                return nik1.s2.a;
            case 24:
                return r6p1.r();
            case 25:
                return prn1.e((l3n1) obj);
            case 26:
                return rih1Var;
            case 27:
                s4b1 s4b1Var = (s4b1) obj;
                if (s4b1Var.t()) {
                    v5b1 v5b1Var = s4b1Var.d;
                    b3i1 type = v5b1Var != null ? v5b1Var.getType() : null;
                    if (u890.j(type, yxu0.e) || u890.j(type, nxu0.f)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 28:
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                return rih1Var;
            default:
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dw81(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }
}
