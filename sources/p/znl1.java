package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Observable;
import java.util.Locale;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class znl1 implements a4l {
    public final bpb1 X = gio1.b(new vnl1());
    public faa0 Y;
    public final tzt a;
    public final aol1 b;
    public final g0l c;
    public final lur d;
    public final v7p e;
    public final mur f;
    public final kfb0 g;
    public final yqg h;
    public final q8n i;
    public final llm t;

    public znl1(tzt tztVar, aol1 aol1Var, g0l g0lVar, lur lurVar, v7p v7pVar, mur murVar, kfb0 kfb0Var, yqg yqgVar, q8n q8nVar) {
        this.a = tztVar;
        this.b = aol1Var;
        this.c = g0lVar;
        this.d = lurVar;
        this.e = v7pVar;
        this.f = murVar;
        this.g = kfb0Var;
        this.h = yqgVar;
        this.i = q8nVar;
        this.t = l1d.x(q8nVar);
    }

    public static int g(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        int iHashCode = upperCase.hashCode();
        if (iHashCode != -2024701067) {
            if (iHashCode != 75572) {
                if (iHashCode == 2217378 && upperCase.equals("HIGH")) {
                    return 3;
                }
            } else if (upperCase.equals("LOW")) {
                return 1;
            }
        } else if (upperCase.equals("MEDIUM")) {
            return 2;
        }
        Logger.k("DevicePredictability: Unknown confidence score: ".concat(str), new Object[0]);
        return 4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        if (r0.equals("NUDGE_PROPENSITY_LEVEL_UNSPECIFIED") == false) goto L25;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int i(java.lang.String r3) {
        /*
            if (r3 == 0) goto L9
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r3.toUpperCase(r0)
            goto La
        L9:
            r0 = 0
        La:
            r1 = 4
            if (r0 == 0) goto L48
            int r2 = r0.hashCode()
            switch(r2) {
                case -1469274363: goto L34;
                case -1121933820: goto L29;
                case 734084584: goto L20;
                case 1697009649: goto L15;
                default: goto L14;
            }
        L14:
            goto L3c
        L15:
            java.lang.String r2 = "NUDGE_PROPENSITY_LEVEL_HIGH"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1e
            goto L3c
        L1e:
            r3 = 3
            return r3
        L20:
            java.lang.String r2 = "NUDGE_PROPENSITY_LEVEL_UNSPECIFIED"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L48
            goto L3c
        L29:
            java.lang.String r2 = "NUDGE_PROPENSITY_LEVEL_MEDIUM"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L32
            goto L3c
        L32:
            r3 = 2
            return r3
        L34:
            java.lang.String r2 = "NUDGE_PROPENSITY_LEVEL_LOW"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L46
        L3c:
            java.lang.String r0 = "DevicePredictability: Unknown nudge propensity level: %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.spotify.base.java.logging.Logger.k(r0, r3)
            return r1
        L46:
            r3 = 1
            return r3
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.znl1.i(java.lang.String):int");
    }

    public static int j(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        if (upperCase.equals("CONTINUE")) {
            return 1;
        }
        if (upperCase.equals("PREDICTION")) {
            return 2;
        }
        Logger.k("DevicePredictability: Unknown suggestion type: ".concat(str), new Object[0]);
        return 3;
    }

    @Override // p.a4l
    public final void a() {
        synchronized (this) {
            try {
                faa0 faa0Var = this.Y;
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                this.Y = null;
                this.X.m((Object) null, new vnl1());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.a4l
    public final void b() {
        throw null;
    }

    public final Observable c() {
        Observable observableJ = ((inr) this.c).j();
        lur lurVar = this.d;
        return Observable.combineLatest(observableJ, m5n1.o(((art) lurVar.b.get()).a, new String[]{"DeviceLastConnection"}, new qrk((byte) 14)).subscribeOn(lurVar.d).map(cq41.V0), new owf1(this, (byte) 15));
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00db  */
    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX WARN: Code duplicated, block: B:50:0x0107  */
    /* JADX WARN: Code duplicated, block: B:53:0x0118 A[Catch: Exception -> 0x0047, CancellationException -> 0x01b7, TryCatch #2 {CancellationException -> 0x01b7, Exception -> 0x0047, blocks: (B:16:0x0042, B:58:0x0155, B:60:0x0160, B:62:0x0196, B:23:0x005e, B:51:0x010e, B:53:0x0118, B:55:0x0121, B:27:0x0072, B:47:0x00e0, B:30:0x007f, B:43:0x00c4, B:33:0x0087, B:39:0x00aa, B:36:0x0090), top: B:68:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:54:0x011f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0152, code lost:
    
        if (r1 == r13) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r23, p.onm r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.znl1.d(java.lang.String, p.onm, boolean):java.lang.Object");
    }
}
