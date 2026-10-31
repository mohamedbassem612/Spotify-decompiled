package p;

import android.os.Bundle;
import android.view.View;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pzo0 extends hab0 implements iu30 {
    public static final pzo0 N0;
    public static final pzo0 O0;
    public static final pzo0 P0;
    public static final pzo0 Q0;
    public static final pzo0 R0;
    public static final pzo0 S0;
    public static final pzo0 T0;
    public static final pzo0 U0;
    public static final pzo0 V0;
    public static final pzo0 W0;
    public static final pzo0 X;
    public static final pzo0 X0;
    public static final pzo0 Y;
    public static final pzo0 Y0;
    public static final pzo0 Z;
    public static final pzo0 Z0;
    public static final pzo0 a1;
    public static final pzo0 b;
    public static final pzo0 b1;
    public static final pzo0 c;
    public static final pzo0 c1;
    public static final pzo0 d;
    public static final pzo0 d1;
    public static final pzo0 e;
    public static final pzo0 e1;
    public static final pzo0 f;
    public static final pzo0 g;
    public static final pzo0 h;
    public static final pzo0 i;
    public static final pzo0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new pzo0(i2, (byte) 0);
        c = new pzo0(i2, (byte) 1);
        d = new pzo0(i2, (byte) 2);
        e = new pzo0(i2, (byte) 3);
        f = new pzo0(i2, (byte) 4);
        g = new pzo0(i2, (byte) 5);
        h = new pzo0(i2, (byte) 6);
        i = new pzo0(i2, (byte) 7);
        t = new pzo0(i2, (byte) 8);
        X = new pzo0(i2, (byte) 9);
        Y = new pzo0(i2, (byte) 10);
        Z = new pzo0(i2, (byte) 11);
        N0 = new pzo0(i2, (byte) 12);
        O0 = new pzo0(i2, (byte) 13);
        P0 = new pzo0(i2, (byte) 14);
        Q0 = new pzo0(i2, (byte) 15);
        R0 = new pzo0(i2, (byte) 16);
        S0 = new pzo0(i2, (byte) 17);
        T0 = new pzo0(i2, (byte) 18);
        U0 = new pzo0(i2, (byte) 19);
        V0 = new pzo0(i2, (byte) 20);
        W0 = new pzo0(i2, (byte) 21);
        X0 = new pzo0(i2, (byte) 22);
        Y0 = new pzo0(i2, (byte) 23);
        Z0 = new pzo0(i2, (byte) 24);
        a1 = new pzo0(i2, (byte) 25);
        b1 = new pzo0(i2, (byte) 26);
        c1 = new pzo0(i2, (byte) 27);
        d1 = new pzo0(i2, (byte) 28);
        e1 = new pzo0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pzo0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        t2b t2bVar = lgo1.b;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 1:
                Object parent = ((View) obj).getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 2:
                return new g1p0(((f1p0) obj).b, null);
            case 3:
                ns60 ns60Var = ((v1p0) obj).a;
                return ns60Var != null ? new x1p0(ns60Var, a2p0.h) : w1p0.a;
            case 4:
                return rih1Var;
            case 5:
                i7p0 i7p0Var = (j7p0) obj;
                return Boolean.valueOf((i7p0Var instanceof i7p0) && i7p0Var.a);
            case 6:
                return rih1Var;
            case 7:
                return ((xh90) obj).b;
            case 8:
                return new p7p0(false, false, false);
            case 9:
                ((n161) obj).b(t2bVar, "TEST_TAG_ARTWORK");
                return rih1Var;
            case 10:
                ((n161) obj).b(t2bVar, "TEST_TAG_ARTWORK");
                return rih1Var;
            case 11:
                ((n161) obj).b(t2bVar, "TEST_TAG_ARTWORK");
                return rih1Var;
            case 12:
                return mno1.h(new mmr0[]{new mmr0("XrNpvElementSavedStateKey", (w9p0) obj)});
            case 13:
                w9p0 w9p0Var = (w9p0) jhc1.t((Bundle) obj, "XrNpvElementSavedStateKey", w9p0.class);
                if (w9p0Var != null) {
                    return w9p0Var;
                }
                eg.m("Saved state not found");
                return null;
            case 14:
                return rih1Var;
            case 15:
                ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj).track().h();
                String strUri = contextTrack != null ? contextTrack.uri() : null;
                return strUri == null ? "" : strUri;
            case 16:
                return rih1Var;
            case 17:
                ((Number) obj).intValue();
                return rih1Var;
            case 18:
                return rih1Var;
            case 19:
                c380 c380Var = (c380) obj;
                return Boolean.valueOf(!c380Var.isEmpty() && ((s3t0) o7h.q0(c380Var)).j);
            case 20:
                return (s3t0) o7h.q0((c380) obj);
            case 21:
                return Integer.valueOf(((qtb0) obj).a);
            case 22:
                return new rxc0((String) obj);
            case 23:
                return ((qxc0) obj).X;
            case 24:
                return Boolean.valueOf(obj instanceof qxc0);
            case 25:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 26:
                wsc0 wsc0Var = (wsc0) obj;
                List list = wsc0Var.e;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!ihc1.y0(((zuc0) obj2).c)) {
                        arrayList.add(obj2);
                    }
                }
                List<zuc0> listD1 = o7h.d1(arrayList, 30);
                ArrayList arrayList2 = new ArrayList(q7h.U(listD1, 10));
                for (zuc0 zuc0Var : listD1) {
                    arrayList2.add(new eof1(zuc0Var.c, zuc0Var.a));
                }
                return new pip0(arrayList2, (String) wsc0Var.f.q.get("user_playlist_uri"));
            case 27:
                return rih1Var;
            case 28:
                vlp0 vlp0Var = (vlp0) obj;
                return new wlp0(0, false, vlp0Var.a, 0, vlp0Var.b);
            default:
                jmp0 jmp0Var = (jmp0) obj;
                return new kmp0(jmp0Var.a, jmp0Var.b, jmp0Var.c, jmp0Var.e, jmp0Var.j);
        }
    }
}
