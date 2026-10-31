package p;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.work.impl.WorkDatabase;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qkn0 implements Function, qiw, s2k1, SingleOnSubscribe, BiFunction, t9v0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ qkn0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public static void f(Context context, sk30 sk30Var) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            sk30Var.a();
            try {
                sk30Var.g(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                sk30Var.g(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                sk30Var.h();
            } finally {
                sk30Var.e();
            }
        }
    }

    public u9v0 a(String str) {
        return new fys((k3i1) this.b, str);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x044c  */
    /* JADX WARN: Code duplicated, block: B:127:0x049a  */
    /* JADX WARN: Code duplicated, block: B:168:0x0547  */
    /* JADX WARN: Code duplicated, block: B:186:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:187:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:189:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:193:0x05df  */
    /* JADX WARN: Code duplicated, block: B:195:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:197:0x0604  */
    /* JADX WARN: Code duplicated, block: B:198:0x0608  */
    /* JADX WARN: Code duplicated, block: B:200:0x0614  */
    /* JADX WARN: Code duplicated, block: B:201:0x0618  */
    /* JADX WARN: Code duplicated, block: B:203:0x0624  */
    /* JADX WARN: Code duplicated, block: B:204:0x0628  */
    /* JADX WARN: Code duplicated, block: B:206:0x0634  */
    /* JADX WARN: Code duplicated, block: B:207:0x0638  */
    /* JADX WARN: Code duplicated, block: B:209:0x0644  */
    /* JADX WARN: Code duplicated, block: B:210:0x0648  */
    /* JADX WARN: Code duplicated, block: B:212:0x0654  */
    /* JADX WARN: Code duplicated, block: B:213:0x0658  */
    /* JADX WARN: Code duplicated, block: B:215:0x0664  */
    /* JADX WARN: Code duplicated, block: B:216:0x0668  */
    /* JADX WARN: Code duplicated, block: B:218:0x0674  */
    /* JADX WARN: Code duplicated, block: B:219:0x0678  */
    /* JADX WARN: Code duplicated, block: B:221:0x0684  */
    /* JADX WARN: Code duplicated, block: B:222:0x0688  */
    /* JADX WARN: Code duplicated, block: B:236:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:237:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:239:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:240:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:242:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:243:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:245:0x0702  */
    /* JADX WARN: Code duplicated, block: B:246:0x0706  */
    /* JADX WARN: Code duplicated, block: B:248:0x0712  */
    /* JADX WARN: Code duplicated, block: B:249:0x0716  */
    /* JADX WARN: Code duplicated, block: B:251:0x0722  */
    /* JADX WARN: Code duplicated, block: B:252:0x0726  */
    /* JADX WARN: Code duplicated, block: B:254:0x0732  */
    /* JADX WARN: Code duplicated, block: B:255:0x0736  */
    /* JADX WARN: Code duplicated, block: B:257:0x0742  */
    /* JADX WARN: Code duplicated, block: B:258:0x0746  */
    /* JADX WARN: Code duplicated, block: B:260:0x0752  */
    /* JADX WARN: Code duplicated, block: B:261:0x0756  */
    /* JADX WARN: Code duplicated, block: B:263:0x0762  */
    /* JADX WARN: Code duplicated, block: B:264:0x0766  */
    /* JADX WARN: Code duplicated, block: B:266:0x0772  */
    /* JADX WARN: Code duplicated, block: B:267:0x0776  */
    /* JADX WARN: Code duplicated, block: B:269:0x0782  */
    /* JADX WARN: Code duplicated, block: B:270:0x0786  */
    /* JADX WARN: Code duplicated, block: B:272:0x0792  */
    /* JADX WARN: Code duplicated, block: B:273:0x0796  */
    /* JADX WARN: Code duplicated, block: B:275:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:276:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:278:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:279:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:281:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:282:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:284:0x07d2  */
    /* JADX WARN: Code duplicated, block: B:285:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:287:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:288:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:290:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:291:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:293:0x0800  */
    /* JADX WARN: Code duplicated, block: B:294:0x0803  */
    /* JADX WARN: Code duplicated, block: B:296:0x080f  */
    /* JADX WARN: Code duplicated, block: B:297:0x0812  */
    /* JADX WARN: Code duplicated, block: B:299:0x081e  */
    /* JADX WARN: Code duplicated, block: B:300:0x0821  */
    /* JADX WARN: Code duplicated, block: B:302:0x082d  */
    /* JADX WARN: Code duplicated, block: B:303:0x0830  */
    /* JADX WARN: Code duplicated, block: B:305:0x083c  */
    /* JADX WARN: Code duplicated, block: B:306:0x083f  */
    /* JADX WARN: Code duplicated, block: B:308:0x0869  */
    /* JADX WARN: Code duplicated, block: B:343:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x0182 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v23 java.lang.Object, still in use, count: 2, list:
          (r2v23 java.lang.Object) from 0x05a4: PHI (r2 I:??) = (r2v15 java.lang.Object), (r2v23 java.lang.Object) binds: [B:183:0x05a3, B:362:0x05a4] A[DONT_GENERATE, DONT_INLINE]
          (r2v23 java.lang.Object) from 0x0592: CHECK_CAST (p.mmr0) (r2v23 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public java.lang.Object apply(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 2576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.qkn0.apply(java.lang.Object):java.lang.Object");
    }

    public long b() {
        Long lA = ((WorkDatabase) this.b).v().a("last_force_stop_ms");
        if (lA != null) {
            return lA.longValue();
        }
        return 0L;
    }

    public boolean c() {
        Long lA = ((WorkDatabase) this.b).v().a("reschedule_needed");
        return lA != null && lA.longValue() == 1;
    }

    public void g() {
        ((Function0) this.b).invoke();
    }

    public void h() {
        ((c7r0) this.b).a(f7r0.c);
    }

    public void i() {
        ((c7r0) this.b).a(g7r0.c);
    }

    public void j() {
        ((c7r0) this.b).a(new h7r0(false));
    }

    public void k() {
        ((c7r0) this.b).a(new h7r0(true));
    }

    public void l() {
        ((c7r0) this.b).a(i7r0.c);
    }

    public void m(Bundle bundle) {
        ((c7r0) this.b).b(bundle);
    }

    public Bundle n() {
        return ((c7r0) this.b).d();
    }

    public void o() {
        ((c7r0) this.b).a(new l7r0((View) null));
    }

    public void p() {
        ((c7r0) this.b).a(new m7r0((ViewGroup) null));
    }

    public void q() {
        ((c7r0) this.b).a(n7r0.c);
    }

    public void r(long j) {
        hnv0 hnv0Var = new hnv0(Long.valueOf(j), "last_force_stop_ms");
        jnv0 jnv0VarV = ((WorkDatabase) this.b).v();
        qyo1.x(jnv0VarV.a, false, true, new gub0(jnv0VarV, hnv0Var, (byte) 13));
    }

    public void s() {
        hnv0 hnv0Var = new hnv0(0L, "reschedule_needed");
        jnv0 jnv0VarV = ((WorkDatabase) this.b).v();
        qyo1.x(jnv0VarV.a, false, true, new gub0(jnv0VarV, hnv0Var, (byte) 13));
    }

    public void subscribe(SingleEmitter singleEmitter) {
        qlr0 qlr0Var = (qlr0) this.b;
        try {
            qlr0Var.b.startConnection(new sjq0(qlr0Var, singleEmitter, (byte) 8));
        } catch (SecurityException e) {
            Logger.l(e, "Install referrer failed", new Object[0]);
            qlr0Var.c.a(5, "Error message: " + e.getMessage());
            singleEmitter.onSuccess(tov0.a);
        }
    }

    public void v(Object obj) {
        min0 lin0Var;
        qam qamVar = (qam) obj;
        j2p0 j2p0Var = (j2p0) this.b;
        FrameLayout frameLayout = j2p0Var.U0;
        View view = j2p0Var.T0;
        dtw dtwVar = j2p0Var.R0;
        c1p0 c1p0Var = j2p0Var.O0;
        if (c1p0Var != null) {
            c1p0Var.a();
        }
        if (qamVar instanceof oam) {
            dtwVar.w.setVisibility(0);
            view.setVisibility(8);
            frameLayout.setVisibility(8);
            return;
        }
        if (qamVar instanceof pam) {
            dtwVar.w.setVisibility(8);
            view.setVisibility(0);
            frameLayout.setVisibility(8);
            return;
        }
        if (!(qamVar instanceof nam)) {
            eg.o();
            return;
        }
        nam namVar = (nam) qamVar;
        dtwVar.w.setVisibility(8);
        view.setVisibility(8);
        frameLayout.setVisibility(0);
        int i = namVar.b;
        String str = namVar.a;
        int iC = l1d.C(i);
        if (iC == 0) {
            lin0Var = new lin0(str);
        } else {
            if (iC != 1) {
                eg.o();
                return;
            }
            lin0Var = new min0(str);
        }
        j2p0Var.V0.f(new pin0(lin0Var));
    }

    public void d() {
    }

    public void e() {
    }

    public Object apply(Object obj, Object obj2) {
        String str;
        PlayerState playerState = (PlayerState) obj;
        spq0 spq0Var = (spq0) obj2;
        if (spq0Var.c()) {
            o6v0 o6v0Var = (o6v0) this.b;
            String str2 = (String) spq0Var.b();
            spq0 spq0VarTrack = playerState.track();
            String str3 = (!spq0VarTrack.c() || (str = (String) ((ContextTrack) spq0VarTrack.b()).metadata().get(ContextTrack$Metadata.KEY_CONTEXT_URI)) == null) ? "" : str;
            spq0 spq0VarTrack2 = playerState.track();
            return new m6v0(str2, str3, spq0VarTrack2.c() ? ((ContextTrack) spq0VarTrack2.b()).provider() : "", playerState.contextUri(), playerState.isPlaying() && !playerState.isPaused(), ((Number) playerState.position(o6v0Var.a.b()).e(0L)).longValue(), ((Number) playerState.duration().e(0L)).longValue());
        }
        return k6v0.a;
    }
}
