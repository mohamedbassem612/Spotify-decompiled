package p;

import android.content.res.Resources;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ica0 implements h0r0 {
    public final qyj a;
    public final z72 b;
    public final pzw c;
    public final dea0 d;
    public final c9c0 e;
    public final b0a0 f;
    public final qo90 g;
    public final xea0 h;
    public final cbr0 i;

    public ica0(qyj qyjVar, z72 z72Var, pzw pzwVar, dea0 dea0Var, los losVar, c9c0 c9c0Var, b0a0 b0a0Var, kca0 kca0Var, Resources resources) {
        p6r0 p6r0VarG1;
        this.a = qyjVar;
        this.b = z72Var;
        this.c = pzwVar;
        this.d = dea0Var;
        this.e = c9c0Var;
        this.f = b0a0Var;
        this.g = kca0Var.a.a;
        xea0 xea0Var = kca0Var.b;
        this.h = xea0Var;
        switch (xea0Var) {
            case SCANNING:
            case DEEPLINKING:
            case NEARBY_WIFI:
            case GOOGLE_MEET:
            case NEARBY_PUSH:
            case IPL_HOST_DIALOG:
            case NOT_SPECIFIED:
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                p6r0VarG1 = yon1.G1("JAM_JOINJAMLINKSHEET", "jam/joinjamlinksheet", 859, "jam");
                break;
            case LOCKSCREEN_INVITATION:
            case NEARBY_DIALOG:
            case SOCIAL_RADAR_TAP:
            case SOCIAL_RADAR_INVITE:
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                p6r0VarG1 = yon1.G1("JAM_JOINJAMPROACTIVEPROMPTSHEET", "jam/joinjamproactivepromptsheet", 861, "jam");
                break;
            case DISCOVERED_DEVICE:
            case TAKE_OVER_DIALOG:
                AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                p6r0VarG1 = yon1.G1("JAM_JOINJAMDEVICESELECTIONSHEET", "jam/joinjamdeviceselectionsheet", 858, "jam");
                break;
            case LISTENING_ACTIVITY:
                AtomicReferenceArray atomicReferenceArray4 = p6r0.e;
                p6r0VarG1 = yon1.G1("JAM_JOINJAMLISTENINGACTIVITYSHEET", "jam/joinjamlisteningactivitysheet", 860, "jam");
                break;
            default:
                eg.o();
                throw null;
        }
        this.i = new cbr0(new dbr0[]{new bn70(p6r0VarG1, nik1.C5, (nar0) null), new nxb(null, ixb.a, Integer.valueOf(resources.getDimensionPixelSize(2131165381)), 0, null, losVar, false, false, false, null, 4057), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public static final int j(ica0 ica0Var) {
        int i;
        switch (ica0Var.h) {
            case SCANNING:
            case DEEPLINKING:
            case NEARBY_WIFI:
            case GOOGLE_MEET:
            case NEARBY_PUSH:
            case IPL_HOST_DIALOG:
            case NOT_SPECIFIED:
            case LISTENING_ACTIVITY:
                i = 1;
                break;
            case LOCKSCREEN_INVITATION:
            case NEARBY_DIALOG:
            case SOCIAL_RADAR_TAP:
            case SOCIAL_RADAR_INVITE:
                i = 2;
                break;
            case DISCOVERED_DEVICE:
            case TAKE_OVER_DIALOG:
                i = 3;
                break;
            default:
                eg.o();
                return 0;
        }
        if (i == 1) {
            List list = ica0Var.g.f;
            if (((no4) ica0Var.f.a.get()).e0() && !list.isEmpty()) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((no90) it.next()).a == 3) {
                        }
                    }
                }
                return 2;
            }
        }
        return i;
    }

    public final cbr0 a() {
        return this.i;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(461949964, new fc3(this, (byte) 13), true));
    }
}
