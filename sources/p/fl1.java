package p;

import android.content.Intent;
import android.media.Image;
import android.view.View;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fl1 implements sh, Function, fg0, jrn0, SingleOnSubscribe, k1q0, xhe1 {
    public final /* synthetic */ byte a;
    public final Object b;

    public fl1(g4r g4rVar) {
        this.a = (byte) 10;
        AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirkM = g4rVar.m(AeFpsRangeLegacyQuirk.class);
        if (aeFpsRangeLegacyQuirkM == null) {
            this.b = null;
        } else {
            this.b = aeFpsRangeLegacyQuirkM.a;
        }
    }

    public w7h1 a(String str) {
        rsk0 rsk0Var = (rsk0) this.b;
        x6h1 x6h1VarC = rsk0Var.c.c();
        x6h1VarC.i.add(new a7h1("thumbnail_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA, rsk0Var.b, System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0128  */
    /* JADX WARN: Code duplicated, block: B:79:0x022c A[PHI: r6
      0x022c: PHI (r6v4 java.lang.String) = (r6v3 java.lang.String), (r6v10 java.lang.String) binds: [B:70:0x0213, B:77:0x0229] A[DONT_GENERATE, DONT_INLINE]] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v6 java.lang.Object, still in use, count: 2, list:
          (r9v6 java.lang.Object) from 0x0123: PHI (r9 I:??) = (r9v3 java.lang.Object), (r9v6 java.lang.Object) binds: [B:41:0x0122, B:102:0x0123] A[DONT_GENERATE, DONT_INLINE]
          (r9v6 java.lang.Object) from 0x0119: CHECK_CAST (java.lang.String) (r9v6 java.lang.Object)
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
    public java.lang.Object apply(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fl1.apply(java.lang.Object):java.lang.Object");
    }

    public void b(Object obj) {
        ((kh0) this.b).a(obj);
    }

    public a1q c(String str) {
        ycc1 ycc1Var;
        w4q w4qVar = (w4q) this.b;
        switch (w4qVar.a) {
            case 0:
                ycc1Var = new ycc1((w4h) w4qVar.b.b.k7.get(), str, (byte) 15);
                break;
            case 1:
                ycc1Var = new ycc1((w4h) w4qVar.b.b.k7.get(), str, (byte) 15);
                break;
            default:
                ycc1Var = new ycc1((w4h) w4qVar.b.b.k7.get(), str, (byte) 15);
                break;
        }
        w4h w4hVar = (w4h) ycc1Var.b;
        c8o.l(w4hVar);
        String str2 = (String) ycc1Var.c;
        c8o.l(str2);
        return new a1q(w4hVar, str2);
    }

    public ByteBuffer d() {
        return ((Image.Plane) this.b).getBuffer();
    }

    public int e() {
        return ((Image.Plane) this.b).getPixelStride();
    }

    public int f() {
        return ((Image.Plane) this.b).getRowStride();
    }

    public irn0 l(Intent intent, th61 th61Var) {
        return ((nw3) this.b).c(intent);
    }

    public boolean r(View view) {
        ((th) this.b).invoke();
        return true;
    }

    public void subscribe(SingleEmitter singleEmitter) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 14:
                q54 q54Var = (q54) obj;
                luk lukVar = q54Var.d;
                if (lukVar == null || !lukVar.i("android-audiobook-playerlistener.should_refresh_capping_state_on_player_error")) {
                    lukVar = q54Var.e;
                }
                if (lukVar != null) {
                    lukVar.e(new p54(singleEmitter, q54Var, (byte) 0));
                }
                break;
            case 15:
            default:
                m26 m26Var = (m26) obj;
                luk lukVar2 = m26Var.r;
                if (lukVar2 == null || !lukVar2.i("apps-music-libs-eventsender.heartbeat_retry_interval")) {
                    lukVar2 = m26Var.s;
                }
                if (lukVar2 != null) {
                    lukVar2.e(new k26(singleEmitter, m26Var, (byte) 5));
                }
                break;
            case 16:
                bk4 bk4Var = (bk4) obj;
                luk lukVar3 = bk4Var.k;
                if (lukVar3 == null || !lukVar3.i("android-gen-alpha-account-creation.parental_controls_transition_entry_point_enabled")) {
                    lukVar3 = bk4Var.l;
                }
                if (lukVar3 != null) {
                    lukVar3.e(new ak4(singleEmitter, bk4Var, (byte) 1));
                }
                break;
        }
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        AppBarLayout appBarLayout = (AppBarLayout) this.b;
        WeakHashMap weakHashMap = b8k1.a;
        hsl1 hsl1Var2 = appBarLayout.getFitsSystemWindows() ? hsl1Var : null;
        if (!Objects.equals(appBarLayout.g, hsl1Var2)) {
            appBarLayout.g = hsl1Var2;
            appBarLayout.setWillNotDraw(!(appBarLayout.U0 != null && appBarLayout.getTopInset() > 0));
            appBarLayout.requestLayout();
        }
        return hsl1Var;
    }

    public fl1(Function0 function0, fg8 fg8Var) {
        this.a = (byte) 27;
        this.b = function0;
    }

    public fl1(op8 op8Var, eeh eehVar) {
        this.a = (byte) 28;
        this.b = eehVar;
    }

    public fl1(RetrofitMaker retrofitMaker) {
        this.a = (byte) 11;
        this.b = (qi3) retrofitMaker.createWebgateService(qi3.class, "android-partner-account-linking-alexa");
    }

    public fl1() {
        this.a = (byte) 24;
        this.b = new AtomicReference(null);
    }

    public /* synthetic */ fl1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
