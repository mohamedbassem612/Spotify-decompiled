package p;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.legacyglue.icons.SpotifyIconView;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.playlistmixing.proto.SetTransition;
import com.spotify.puffin.setup.setupflow.manualselect.ui.AmbiguousDeviceSelectView;
import com.spotify.puffin.setup.setupflow.manualselect.ui.ManualSelectView;
import com.spotify.puffin.setup.setupflow.ui.ErrorView;
import com.spotify.puffin.sharedui.views.DisconnectedView;
import com.spotify.sessiontuningcontrols.proto.SignalPayloadProto;
import com.spotify.voiceassistants.playermodels.SearchEndpointRequest;
import com.spotify.voiceassistants.playermodels.SpeakeasyDualResponse;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mzr0 implements lw40, Function {
    public final Object a;
    public Object b;
    public Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;

    public mzr0(mzr0 mzr0Var) {
        ArrayList arrayList = (ArrayList) mzr0Var.a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) mzr0Var.g;
        LinkedHashSet linkedHashSet2 = cqu.v;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add((s6b) cqu.w.get((Class) it.next()));
        }
        this.a = arrayList2;
        this.g = new qpp0((byte) 6);
        this.f = (ArrayList) mzr0Var.f;
        ArrayList arrayList3 = (ArrayList) mzr0Var.b;
        this.b = arrayList3;
        ArrayList arrayList4 = (ArrayList) mzr0Var.c;
        this.c = arrayList4;
        ArrayList arrayList5 = (ArrayList) mzr0Var.d;
        this.d = arrayList5;
        HashSet hashSet = (HashSet) mzr0Var.e;
        this.e = hashSet;
        new HashMap();
        ArrayList arrayList6 = new ArrayList(arrayList3);
        arrayList6.add(new j69((byte) 1));
        arrayList6.add(new j69((byte) 2));
        arrayList6.add(new j69((byte) 3));
        arrayList6.add(new j69((byte) 0));
        arrayList6.add(new j69((byte) 4));
        HashMap map = new HashMap();
        Object[] objArr = {new sh7('*'), new sh7('_')};
        ArrayList arrayList7 = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList7.add(obj);
        }
        ug80.b(Collections.unmodifiableList(arrayList7), map);
        ug80.b(arrayList4, map);
        new ArrayList(arrayList5).add(new h5n());
        BitSet bitSet = new BitSet();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            bitSet.set(((Character) it2.next()).charValue());
        }
        bitSet.set(33);
        Set setKeySet = map.keySet();
        BitSet bitSet2 = (BitSet) bitSet.clone();
        Iterator it3 = setKeySet.iterator();
        while (it3.hasNext()) {
            bitSet2.set(((Character) it3.next()).charValue());
        }
        Iterator it4 = arrayList6.iterator();
        while (it4.hasNext()) {
            Iterator it5 = ((j69) it4.next()).a().iterator();
            while (it5.hasNext()) {
                bitSet2.set(((Character) it5.next()).charValue());
            }
        }
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(33);
        bitSet2.set(10);
    }

    public static String s(String str) {
        Set set = s4b1.f;
        String strS = uic.x(str).s();
        if (strS != null) {
            return strS;
        }
        hhg1.n(l1d.m("Invalid user URI: ", str));
        return null;
    }

    public lhg1 A(lhg1 lhg1Var, String str) {
        return lhg1.a(lhg1Var, null, ruq0.a(lhg1Var.b, null, null, null, null, null, null, ((cbk0) this.d).b.b, str, 0, 0, 0, null, null, null, false, 0.0f, 0.0f, 0.0d, 0.0d, 524095), false, false, 13);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:65:0x012e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
    
        if (r1.emit(r8, r12) == r9) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [p.mzr0] */
    /* JADX WARN: Type inference failed for: r1v0, types: [p.vr20] */
    /* JADX WARN: Type inference failed for: r1v1, types: [p.vr20] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r8v1, types: [p.vr20] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(p.vr20 r19, p.b1k0 r20, p.onm r21) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mzr0.a(p.vr20, p.b1k0, p.onm):java.lang.Object");
    }

    public Object apply(Object obj) {
        Single map;
        String str = (String) obj;
        Object obj2 = this.a;
        bo91 bo91Var = (bo91) obj2;
        String str2 = (String) this.b;
        bo91Var.getClass();
        if (!u890.j(str2, str) || bo91Var.k.b(str2)) {
            map = rqt0.G(new ao91(bo91Var, str, (lnm) null, (byte) 1)).doOnSuccess(w841.a1).ignoreElement().e(rqt0.G(new ao91(bo91Var, str, (lnm) null, (byte) 0)).map(kuw0.g)).map(new ke71(bo91Var, str2, (byte) 26));
            map.getClass();
        } else {
            map = Single.just(z6x.a);
            map.getClass();
        }
        return map.flatMapCompletable(new s880((bo91) obj2, (String) this.b, str, (EsPlayOrigin.PlayOrigin) this.c, (String) this.d, (String) this.f, (kqz) this.e, (String) this.g));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(ykg1 ykg1Var, Exception exc, onm onmVar) {
        ad41 ad41Var;
        if (onmVar instanceof ad41) {
            ad41Var = (ad41) onmVar;
            int i = ad41Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ad41Var.d = i - Integer.MIN_VALUE;
            } else {
                ad41Var = new ad41(this, onmVar);
            }
        } else {
            ad41Var = new ad41(this, onmVar);
        }
        Object objG = ad41Var.b;
        int i2 = ad41Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objG);
                alg1 alg1Var = (alg1) this.f;
                ad41Var.a = exc;
                ad41Var.d = 1;
                objG = alg1Var.g(ykg1Var, ad41Var);
                d9n d9nVar = d9n.a;
                if (objG == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                exc = ad41Var.a;
                hm5.M(objG);
            }
            ((py21) objG).d();
        } catch (Exception e) {
            j2h1.h(exc, e);
        }
        return rih1.a;
    }

    public void c() {
        ((pw40) this.d).a();
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:73:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x0117  */
    /* JADX WARN: Code duplicated, block: B:78:0x0119  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0131 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0133  */
    /* JADX WARN: Code duplicated, block: B:83:0x0135  */
    /* JADX WARN: Code duplicated, block: B:85:0x015c  */
    public Object d(String str, String str2, int i, ou80 ou80Var, vu30 vu30Var, r6h1 r6h1Var, Integer num, onm onmVar) {
        xc61 xc61Var;
        String str3;
        String str4;
        r6h1 r6h1Var2;
        Integer num2;
        Throwable th;
        r6h1 r6h1Var3;
        vu30 vu30Var2;
        String str5;
        r6h1 r6h1Var4;
        Integer num3;
        Map map;
        Throwable thA;
        boolean z;
        boolean z2;
        Integer numValueOf;
        Integer num4;
        View.OnClickListener jl5Var;
        boolean z3;
        String str6 = (String) this.c;
        if (onmVar instanceof xc61) {
            xc61Var = (xc61) onmVar;
            int i2 = xc61Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xc61Var.i = i2 - Integer.MIN_VALUE;
            } else {
                xc61Var = new xc61(this, onmVar);
            }
        } else {
            xc61Var = new xc61(this, onmVar);
        }
        Object objA = xc61Var.g;
        int i3 = xc61Var.i;
        try {
            if (i3 == 0) {
                hm5.M(objA);
                try {
                    iyc0 iyc0Var = (iyc0) this.d;
                    try {
                        cm81 cm81VarN = SignalPayloadProto.SignalPayload.n();
                        cm81VarN.n(ou80Var.a);
                        str4 = str2;
                        try {
                            ayc0 ayc0Var = new ayc0(str4, (phc) null, cm81VarN.build().toByteString(), false, (String) null, 26);
                            str3 = str;
                            try {
                                xc61Var.a = str3;
                                str4 = str2;
                                try {
                                    xc61Var.b = str4;
                                    try {
                                        xc61Var.c = (a8d1) vu30Var;
                                        r6h1Var2 = r6h1Var;
                                        try {
                                            xc61Var.d = r6h1Var2;
                                            num2 = num;
                                            try {
                                                xc61Var.e = num2;
                                                i = i;
                                                try {
                                                    xc61Var.f = i;
                                                    xc61Var.i = 1;
                                                    objA = iyc0.a(iyc0Var, str6, ayc0Var, xc61Var);
                                                    d9n d9nVar = d9n.a;
                                                    if (objA == d9nVar) {
                                                        return d9nVar;
                                                    }
                                                    str5 = str3;
                                                    r6h1Var4 = r6h1Var2;
                                                    num3 = num2;
                                                    vu30Var2 = vu30Var;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    th = th;
                                                    r6h1Var3 = r6h1Var2;
                                                    vu30Var2 = vu30Var;
                                                    Map m231Var = new m231(th);
                                                    str5 = str3;
                                                    r6h1Var4 = r6h1Var3;
                                                    map = m231Var;
                                                    num3 = num2;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                i = i;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            num2 = num;
                                            th = th;
                                            r6h1Var3 = r6h1Var2;
                                            vu30Var2 = vu30Var;
                                            Map m231Var2 = new m231(th);
                                            str5 = str3;
                                            r6h1Var4 = r6h1Var3;
                                            map = m231Var2;
                                            num3 = num2;
                                            thA = e331.a(map);
                                            if (thA != null) {
                                                Logger.l(thA, "Failed to emit signal %s for %s", new Object[]{str4, str6});
                                            }
                                            if (map instanceof m231) {
                                                z = ((zwz0) this.e).a() instanceof swz0;
                                                if (z) {
                                                    i = num3.intValue();
                                                }
                                                Integer numValueOf2 = Integer.valueOf(i);
                                                if (i != 0) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                n57.k(z2, "Invalid resource ID provided: %s", new Object[]{numValueOf2});
                                                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                                                numValueOf = Integer.valueOf(i);
                                                if (z) {
                                                    num4 = null;
                                                    jl5Var = null;
                                                } else {
                                                    if (i != 0) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    n57.k(z3, "Invalid resource ID provided: %s", new Object[]{numValueOf});
                                                    num4 = 2131961637;
                                                    jl5Var = new jl5(this, str5, vu30Var2, r6h1Var4, (byte) 8);
                                                }
                                                ((kt91) this.f).k(new er91((fs91) null, "", numValueOf, (String) null, num4, jl5Var, (cvr) null, (xq91) null, false));
                                                i8h1 i8h1Var = (i8h1) this.a;
                                                y6h1 y6h1Var = y6h1.i;
                                                x6h1 x6h1VarI = i3o1.i();
                                                x6h1VarI.h = "music";
                                                x6h1VarI.a = "mobile-session-control-chips-v2";
                                                x6h1VarI.f = "2.1.0";
                                                x6h1VarI.g = "22.0.0";
                                                x6h1 x6h1VarC = x6h1VarI.a().c();
                                                x6h1VarC.i.add(new a7h1("retry_snackbar", str5, (Integer) null, (String) null, (String) null));
                                                x6h1VarC.j = true;
                                                y6h1 y6h1VarA = x6h1VarC.a();
                                                k7h1 k7h1Var = new k7h1();
                                                ((xjn) k7h1Var).a = y6h1VarA;
                                                ((xjn) k7h1Var).b = r6h1Var4;
                                                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                                                i8h1Var.f(k7h1Var.a(), (Set) null);
                                            }
                                            return rih1.a;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        r6h1Var2 = r6h1Var;
                                        num2 = num;
                                        th = th;
                                        r6h1Var3 = r6h1Var2;
                                        vu30Var2 = vu30Var;
                                        Map m231Var3 = new m231(th);
                                        str5 = str3;
                                        r6h1Var4 = r6h1Var3;
                                        map = m231Var3;
                                        num3 = num2;
                                        thA = e331.a(map);
                                        if (thA != null) {
                                            Logger.l(thA, "Failed to emit signal %s for %s", new Object[]{str4, str6});
                                        }
                                        if (map instanceof m231) {
                                            z = ((zwz0) this.e).a() instanceof swz0;
                                            if (z) {
                                                i = num3.intValue();
                                            }
                                            Integer numValueOf3 = Integer.valueOf(i);
                                            if (i != 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            n57.k(z2, "Invalid resource ID provided: %s", new Object[]{numValueOf3});
                                            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                                            numValueOf = Integer.valueOf(i);
                                            if (z) {
                                                if (i != 0) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                n57.k(z3, "Invalid resource ID provided: %s", new Object[]{numValueOf});
                                                num4 = 2131961637;
                                                jl5Var = new jl5(this, str5, vu30Var2, r6h1Var4, (byte) 8);
                                            } else {
                                                num4 = null;
                                                jl5Var = null;
                                            }
                                            ((kt91) this.f).k(new er91((fs91) null, "", numValueOf, (String) null, num4, jl5Var, (cvr) null, (xq91) null, false));
                                            i8h1 i8h1Var2 = (i8h1) this.a;
                                            y6h1 y6h1Var2 = y6h1.i;
                                            x6h1 x6h1VarI2 = i3o1.i();
                                            x6h1VarI2.h = "music";
                                            x6h1VarI2.a = "mobile-session-control-chips-v2";
                                            x6h1VarI2.f = "2.1.0";
                                            x6h1VarI2.g = "22.0.0";
                                            x6h1 x6h1VarC2 = x6h1VarI2.a().c();
                                            x6h1VarC2.i.add(new a7h1("retry_snackbar", str5, (Integer) null, (String) null, (String) null));
                                            x6h1VarC2.j = true;
                                            y6h1 y6h1VarA2 = x6h1VarC2.a();
                                            k7h1 k7h1Var2 = new k7h1();
                                            ((xjn) k7h1Var2).a = y6h1VarA2;
                                            ((xjn) k7h1Var2).b = r6h1Var4;
                                            ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                                            i8h1Var2.f(k7h1Var2.a(), (Set) null);
                                        }
                                        return rih1.a;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    r6h1Var2 = r6h1Var;
                                    num2 = num;
                                    th = th;
                                    r6h1Var3 = r6h1Var2;
                                    vu30Var2 = vu30Var;
                                    Map m231Var4 = new m231(th);
                                    str5 = str3;
                                    r6h1Var4 = r6h1Var3;
                                    map = m231Var4;
                                    num3 = num2;
                                    thA = e331.a(map);
                                    if (thA != null) {
                                        Logger.l(thA, "Failed to emit signal %s for %s", new Object[]{str4, str6});
                                    }
                                    if (map instanceof m231) {
                                        z = ((zwz0) this.e).a() instanceof swz0;
                                        if (z) {
                                            i = num3.intValue();
                                        }
                                        Integer numValueOf4 = Integer.valueOf(i);
                                        if (i != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        n57.k(z2, "Invalid resource ID provided: %s", new Object[]{numValueOf4});
                                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                                        numValueOf = Integer.valueOf(i);
                                        if (z) {
                                            if (i != 0) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            n57.k(z3, "Invalid resource ID provided: %s", new Object[]{numValueOf});
                                            num4 = 2131961637;
                                            jl5Var = new jl5(this, str5, vu30Var2, r6h1Var4, (byte) 8);
                                        } else {
                                            num4 = null;
                                            jl5Var = null;
                                        }
                                        ((kt91) this.f).k(new er91((fs91) null, "", numValueOf, (String) null, num4, jl5Var, (cvr) null, (xq91) null, false));
                                        i8h1 i8h1Var3 = (i8h1) this.a;
                                        y6h1 y6h1Var3 = y6h1.i;
                                        x6h1 x6h1VarI3 = i3o1.i();
                                        x6h1VarI3.h = "music";
                                        x6h1VarI3.a = "mobile-session-control-chips-v2";
                                        x6h1VarI3.f = "2.1.0";
                                        x6h1VarI3.g = "22.0.0";
                                        x6h1 x6h1VarC3 = x6h1VarI3.a().c();
                                        x6h1VarC3.i.add(new a7h1("retry_snackbar", str5, (Integer) null, (String) null, (String) null));
                                        x6h1VarC3.j = true;
                                        y6h1 y6h1VarA3 = x6h1VarC3.a();
                                        k7h1 k7h1Var3 = new k7h1();
                                        ((xjn) k7h1Var3).a = y6h1VarA3;
                                        ((xjn) k7h1Var3).b = r6h1Var4;
                                        ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                                        i8h1Var3.f(k7h1Var3.a(), (Set) null);
                                    }
                                    return rih1.a;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                str4 = str2;
                                r6h1Var2 = r6h1Var;
                                num2 = num;
                                th = th;
                                r6h1Var3 = r6h1Var2;
                                vu30Var2 = vu30Var;
                                Map m231Var5 = new m231(th);
                                str5 = str3;
                                r6h1Var4 = r6h1Var3;
                                map = m231Var5;
                                num3 = num2;
                                thA = e331.a(map);
                                if (thA != null) {
                                    Logger.l(thA, "Failed to emit signal %s for %s", new Object[]{str4, str6});
                                }
                                if (map instanceof m231) {
                                    z = ((zwz0) this.e).a() instanceof swz0;
                                    if (z) {
                                        i = num3.intValue();
                                    }
                                    Integer numValueOf5 = Integer.valueOf(i);
                                    if (i != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    n57.k(z2, "Invalid resource ID provided: %s", new Object[]{numValueOf5});
                                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                                    numValueOf = Integer.valueOf(i);
                                    if (z) {
                                        if (i != 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        n57.k(z3, "Invalid resource ID provided: %s", new Object[]{numValueOf});
                                        num4 = 2131961637;
                                        jl5Var = new jl5(this, str5, vu30Var2, r6h1Var4, (byte) 8);
                                    } else {
                                        num4 = null;
                                        jl5Var = null;
                                    }
                                    ((kt91) this.f).k(new er91((fs91) null, "", numValueOf, (String) null, num4, jl5Var, (cvr) null, (xq91) null, false));
                                    i8h1 i8h1Var4 = (i8h1) this.a;
                                    y6h1 y6h1Var4 = y6h1.i;
                                    x6h1 x6h1VarI4 = i3o1.i();
                                    x6h1VarI4.h = "music";
                                    x6h1VarI4.a = "mobile-session-control-chips-v2";
                                    x6h1VarI4.f = "2.1.0";
                                    x6h1VarI4.g = "22.0.0";
                                    x6h1 x6h1VarC4 = x6h1VarI4.a().c();
                                    x6h1VarC4.i.add(new a7h1("retry_snackbar", str5, (Integer) null, (String) null, (String) null));
                                    x6h1VarC4.j = true;
                                    y6h1 y6h1VarA4 = x6h1VarC4.a();
                                    k7h1 k7h1Var4 = new k7h1();
                                    ((xjn) k7h1Var4).a = y6h1VarA4;
                                    ((xjn) k7h1Var4).b = r6h1Var4;
                                    ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                                    i8h1Var4.f(k7h1Var4.a(), (Set) null);
                                }
                                return rih1.a;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            str3 = str;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        str3 = str;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    str3 = str;
                    str4 = str2;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = xc61Var.f;
                num3 = xc61Var.e;
                r6h1 r6h1Var5 = xc61Var.d;
                vu30Var2 = (vu30) xc61Var.c;
                String str7 = xc61Var.b;
                str5 = xc61Var.a;
                try {
                    hm5.M(objA);
                    i = i4;
                    r6h1Var4 = r6h1Var5;
                    str4 = str7;
                } catch (Throwable th11) {
                    i = i4;
                    str3 = str5;
                    th = th11;
                    r6h1Var3 = r6h1Var5;
                    str4 = str7;
                    num2 = num3;
                    Map m231Var6 = new m231(th);
                    str5 = str3;
                    r6h1Var4 = r6h1Var3;
                    map = m231Var6;
                    num3 = num2;
                    thA = e331.a(map);
                    if (thA != null) {
                        Logger.l(thA, "Failed to emit signal %s for %s", new Object[]{str4, str6});
                    }
                    if (map instanceof m231) {
                        z = ((zwz0) this.e).a() instanceof swz0;
                        if (z) {
                            i = num3.intValue();
                        }
                        Integer numValueOf6 = Integer.valueOf(i);
                        if (i != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        n57.k(z2, "Invalid resource ID provided: %s", new Object[]{numValueOf6});
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                        numValueOf = Integer.valueOf(i);
                        if (z) {
                            if (i != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            n57.k(z3, "Invalid resource ID provided: %s", new Object[]{numValueOf});
                            num4 = 2131961637;
                            jl5Var = new jl5(this, str5, vu30Var2, r6h1Var4, (byte) 8);
                        } else {
                            num4 = null;
                            jl5Var = null;
                        }
                        ((kt91) this.f).k(new er91((fs91) null, "", numValueOf, (String) null, num4, jl5Var, (cvr) null, (xq91) null, false));
                        i8h1 i8h1Var5 = (i8h1) this.a;
                        y6h1 y6h1Var5 = y6h1.i;
                        x6h1 x6h1VarI5 = i3o1.i();
                        x6h1VarI5.h = "music";
                        x6h1VarI5.a = "mobile-session-control-chips-v2";
                        x6h1VarI5.f = "2.1.0";
                        x6h1VarI5.g = "22.0.0";
                        x6h1 x6h1VarC5 = x6h1VarI5.a().c();
                        x6h1VarC5.i.add(new a7h1("retry_snackbar", str5, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = true;
                        y6h1 y6h1VarA5 = x6h1VarC5.a();
                        k7h1 k7h1Var5 = new k7h1();
                        ((xjn) k7h1Var5).a = y6h1VarA5;
                        ((xjn) k7h1Var5).b = r6h1Var4;
                        ((xjn) k7h1Var5).c = Long.valueOf(System.currentTimeMillis());
                        i8h1Var5.f(k7h1Var5.a(), (Set) null);
                    }
                    return rih1.a;
                }
            }
            try {
                map = (Map) ((py21) objA).d();
            } catch (Throwable th12) {
                String str8 = str5;
                th = th12;
                r6h1Var3 = r6h1Var4;
                str3 = str8;
                num2 = num3;
                Map m231Var7 = new m231(th);
                str5 = str3;
                r6h1Var4 = r6h1Var3;
                map = m231Var7;
                num3 = num2;
            }
            thA = e331.a(map);
            if (thA != null) {
                Logger.l(thA, "Failed to emit signal %s for %s", new Object[]{str4, str6});
            }
            if (map instanceof m231) {
                z = ((zwz0) this.e).a() instanceof swz0;
                if (z && num3 != null) {
                    i = num3.intValue();
                }
                Integer numValueOf7 = Integer.valueOf(i);
                if (i != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                n57.k(z2, "Invalid resource ID provided: %s", new Object[]{numValueOf7});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                numValueOf = Integer.valueOf(i);
                if (z) {
                    if (i != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    n57.k(z3, "Invalid resource ID provided: %s", new Object[]{numValueOf});
                    num4 = 2131961637;
                    jl5Var = new jl5(this, str5, vu30Var2, r6h1Var4, (byte) 8);
                } else {
                    num4 = null;
                    jl5Var = null;
                }
                ((kt91) this.f).k(new er91((fs91) null, "", numValueOf, (String) null, num4, jl5Var, (cvr) null, (xq91) null, false));
                i8h1 i8h1Var6 = (i8h1) this.a;
                y6h1 y6h1Var6 = y6h1.i;
                x6h1 x6h1VarI6 = i3o1.i();
                x6h1VarI6.h = "music";
                x6h1VarI6.a = "mobile-session-control-chips-v2";
                x6h1VarI6.f = "2.1.0";
                x6h1VarI6.g = "22.0.0";
                x6h1 x6h1VarC6 = x6h1VarI6.a().c();
                x6h1VarC6.i.add(new a7h1("retry_snackbar", str5, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = true;
                y6h1 y6h1VarA6 = x6h1VarC6.a();
                k7h1 k7h1Var6 = new k7h1();
                ((xjn) k7h1Var6).a = y6h1VarA6;
                ((xjn) k7h1Var6).b = r6h1Var4;
                ((xjn) k7h1Var6).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var6.f(k7h1Var6.a(), (Set) null);
            }
            return rih1.a;
        } catch (CancellationException e) {
            throw e;
        }
    }

    public Single e(String str, String str2, String str3) {
        return ((j23) ((c23) this.c)).c(str2, (str3 == null || !Pattern.compile("^spotify:image:[0-9a-fA-F]+$").matcher(str3).matches()) ? null : ihc1.V0(str3, ':', str3)).doOnError(mux0.d);
    }

    public Single f(String str, String str2, djw0 djw0Var, boolean z) {
        return Single.zip(((xov0) this.a).a(), ((dxz0) this.e).e().firstOrError().onErrorReturn(xi20.e1), yi20.c1).flatMap(new vrv0(this, str2, djw0Var, str, z));
    }

    public Single g(String str, String str2, djw0 djw0Var, String str3, boolean z) {
        String str4 = (String) ((wdm) this.g).f;
        if (ihc1.y0(str4)) {
            str4 = "premium-destination-hubs";
        }
        return Single.zip(((xov0) this.a).a(), ((dxz0) this.e).e().firstOrError().onErrorReturn(zi20.a1), aj20.d1).flatMap(new p68(this, z, str4, str3, djw0Var, str, str2));
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0106 A[Catch: Exception -> 0x0152, TRY_LEAVE, TryCatch #3 {Exception -> 0x0152, blocks: (B:46:0x0102, B:48:0x0106, B:65:0x0155, B:66:0x015c), top: B:84:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0155 A[Catch: Exception -> 0x0152, TRY_ENTER, TryCatch #3 {Exception -> 0x0152, blocks: (B:46:0x0102, B:48:0x0106, B:65:0x0155, B:66:0x015c), top: B:84:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x017b  */
    /* JADX WARN: Code duplicated, block: B:74:0x017f  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Multi-variable type inference failed */
    public Object h(b1k0 b1k0Var, y0k0 y0k0Var, onm onmVar) throws Exception {
        bd41 bd41Var;
        int i;
        lnm lnmVar;
        byte b;
        Object objE;
        lnm lnmVar2;
        x0k0 x0k0VarX;
        Exception exc;
        lnm lnmVar3;
        Object obj;
        lnm lnmVar4;
        lnm lnmVar5;
        Object objY;
        lnm lnmVar6;
        Object objY2;
        lnm lnmVar7;
        lnm lnmVar8;
        b1k0 b1k0Var2 = b1k0Var;
        cbk0 cbk0Var = (cbk0) this.d;
        if (onmVar instanceof bd41) {
            bd41Var = (bd41) onmVar;
            int i2 = bd41Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bd41Var.h = i2 - Integer.MIN_VALUE;
            } else {
                bd41Var = new bd41(this, onmVar);
            }
        } else {
            bd41Var = new bd41(this, onmVar);
        }
        bd41 bd41Var2 = bd41Var;
        Object obj2 = bd41Var2.f;
        int i3 = bd41Var2.h;
        Object obj3 = rih1.a;
        d9n d9nVar = d9n.a;
        byte b2 = 1;
        if (i3 == 0) {
            hm5.M(obj2);
            xyc0 xyc0Var = (iyc0) this.c;
            String str = cbk0Var.a;
            List listSingletonList = Collections.singletonList(y0k0Var.a);
            String str2 = cbk0Var.b.b;
            ou80 ou80Var = b1k0Var2.h;
            zxc0 zxc0Var = ou80Var != null ? new zxc0(ou80Var) : null;
            bd41Var2.a = b1k0Var2;
            bd41Var2.h = 1;
            i = 2;
            lnmVar = null;
            b = 5;
            objE = xyc0Var.e(str, listSingletonList, str2, "playlist-mixing-track-swap", "", zxc0Var, bd41Var2);
            if (objE != d9nVar) {
            }
            return d9nVar;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                x0k0VarX = bd41Var2.c;
                lnm lnmVar9 = bd41Var2.b;
                try {
                    hm5.M(obj2);
                    obj = obj2;
                    b = 5;
                    b2 = 1;
                    lnmVar6 = null;
                    lnmVar4 = lnmVar9;
                    try {
                        if (((py21) obj) != null) {
                            throw new IOException("Timed out saving transition after inserting track");
                        }
                        ykg1 ykg1VarF = ((alg1) this.f).f(x0k0VarX);
                        geo0 geo0Var = geo0.b;
                        lc41 lc41Var = new lc41(this, ykg1VarF, lnmVar6, b2);
                        bd41Var2.a = lnmVar6;
                        bd41Var2.b = lnmVar4;
                        bd41Var2.c = lnmVar6;
                        bd41Var2.d = lnmVar6;
                        bd41Var2.h = 4;
                        objY2 = fn31.Y(geo0Var, lc41Var, bd41Var2);
                        lnmVar8 = lnmVar4;
                        lnmVar7 = lnmVar6;
                        if (objY2 != d9nVar) {
                        }
                        return d9nVar;
                    } catch (Exception e) {
                        exc = e;
                        lnmVar3 = lnmVar4;
                        lnmVar5 = lnmVar6;
                        bd41Var2.a = lnmVar5;
                        bd41Var2.b = lnmVar5;
                        bd41Var2.c = lnmVar5;
                        bd41Var2.d = exc;
                        bd41Var2.h = 3;
                        objY = fn31.Y(geo0.b, new n641(exc, this, lnmVar3, lnmVar5, (byte) 4), bd41Var2);
                        if (objY == d9nVar) {
                            obj3 = objY;
                        }
                        if (obj3 != d9nVar) {
                            throw exc;
                        }
                    }
                } catch (Exception e2) {
                    exc = e2;
                    lnmVar5 = null;
                    lnmVar3 = lnmVar9;
                    bd41Var2.a = lnmVar5;
                    bd41Var2.b = lnmVar5;
                    bd41Var2.c = lnmVar5;
                    bd41Var2.d = exc;
                    bd41Var2.h = 3;
                    objY = fn31.Y(geo0.b, new n641(exc, this, lnmVar3, lnmVar5, (byte) 4), bd41Var2);
                    if (objY == d9nVar) {
                        obj3 = objY;
                    }
                    if (obj3 != d9nVar) {
                        throw exc;
                    }
                    return d9nVar;
                }
            } else {
                if (i3 == 3) {
                    Exception exc2 = bd41Var2.d;
                    hm5.M(obj2);
                    throw exc2;
                }
                if (i3 != 4) {
                    if (i3 != 5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Exception exc3 = bd41Var2.e;
                    ykg1 ykg1Var = bd41Var2.d;
                    hm5.M(obj2);
                    throw exc3;
                }
                ykg1 ykg1Var2 = bd41Var2.d;
                lnm lnmVar10 = bd41Var2.b;
                hm5.M(obj2);
                lnmVar8 = lnmVar10;
                objY2 = obj2;
                b = 5;
                lnmVar7 = null;
            }
            try {
                return lnmVar8;
            } catch (Exception e3) {
                bd41Var2.a = lnmVar7;
                bd41Var2.b = lnmVar7;
                bd41Var2.c = lnmVar7;
                bd41Var2.d = lnmVar7;
                bd41Var2.e = e3;
                bd41Var2.h = b;
                Object objY3 = fn31.Y(geo0.b, new n641(e3, this, lnmVar8, lnmVar7, (byte) 4), bd41Var2);
                if (objY3 == d9nVar) {
                    obj3 = objY3;
                }
                if (obj3 != d9nVar) {
                    throw e3;
                }
            }
        } else {
            b1k0Var2 = bd41Var2.a;
            hm5.M(obj2);
            objE = obj2;
            b = 5;
            i = 2;
            lnmVar = null;
        }
        lnm lnmVar11 = (String) o7h.s0((List) ((py21) objE).d());
        if (lnmVar11 != null) {
            if (lnmVar11.length() <= 0) {
                lnmVar2 = lnmVar11;
                lnmVar2 = lnmVar;
            }
            if (lnmVar2 != null) {
                x0k0VarX = x(b1k0Var2, lnmVar2);
                try {
                    i7u0 i7u0Var = new i7u0(this, lnmVar, b);
                    bd41Var2.a = lnmVar;
                    bd41Var2.b = lnmVar2;
                    bd41Var2.c = x0k0VarX;
                    bd41Var2.h = i;
                    Object objO = rc2.O(30000L, i7u0Var, bd41Var2);
                    if (objO != d9nVar) {
                        obj = objO;
                        lnmVar4 = lnmVar2;
                        lnmVar6 = lnmVar;
                        if (((py21) obj) != null) {
                            throw new IOException("Timed out saving transition after inserting track");
                        }
                        ykg1 ykg1VarF2 = ((alg1) this.f).f(x0k0VarX);
                        geo0 geo0Var2 = geo0.b;
                        lc41 lc41Var2 = new lc41(this, ykg1VarF2, lnmVar6, b2);
                        bd41Var2.a = lnmVar6;
                        bd41Var2.b = lnmVar4;
                        bd41Var2.c = lnmVar6;
                        bd41Var2.d = lnmVar6;
                        bd41Var2.h = 4;
                        objY2 = fn31.Y(geo0Var2, lc41Var2, bd41Var2);
                        lnmVar8 = lnmVar4;
                        lnmVar7 = lnmVar6;
                        if (objY2 != d9nVar) {
                            return lnmVar8;
                        }
                    }
                } catch (Exception e4) {
                    exc = e4;
                    lnmVar3 = lnmVar2;
                    lnmVar5 = lnmVar;
                    bd41Var2.a = lnmVar5;
                    bd41Var2.b = lnmVar5;
                    bd41Var2.c = lnmVar5;
                    bd41Var2.d = exc;
                    bd41Var2.h = 3;
                    objY = fn31.Y(geo0.b, new n641(exc, this, lnmVar3, lnmVar5, (byte) 4), bd41Var2);
                    if (objY == d9nVar) {
                        obj3 = objY;
                    }
                    if (obj3 != d9nVar) {
                        throw exc;
                    }
                    return d9nVar;
                }
                return d9nVar;
            }
        }
        eg.m("No row ID returned after inserting track");
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable i(String str, onm onmVar) {
        n721 n721Var;
        Boolean m231Var;
        if (onmVar instanceof n721) {
            n721Var = (n721) onmVar;
            int i = n721Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n721Var.c = i - Integer.MIN_VALUE;
            } else {
                n721Var = new n721(this, onmVar);
            }
        } else {
            n721Var = new n721(this, onmVar);
        }
        Object objY = n721Var.a;
        int i2 = n721Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objY);
                i430 i430VarC = ((r630) this.d).c(str);
                if (i430VarC != null) {
                    return Boolean.valueOf(i430VarC.b);
                }
                String strS = s(str);
                q8n q8nVar = (q8n) this.g;
                o721 o721Var = new o721(this, strS, (lnm) null, (byte) 0);
                n721Var.c = 1;
                objY = fn31.Y(q8nVar, o721Var, n721Var);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objY);
            }
            m231Var = (Boolean) objY;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return m231Var instanceof m231 ? Boolean.FALSE : m231Var;
    }

    public boolean j() {
        return ((pw40) this.d).b.isShowing();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0053 -> B:20:0x0056). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object k(java.util.List r5, p.onm r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p.s621
            if (r0 == 0) goto L13
            r0 = r6
            p.s621 r0 = (p.s621) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.s621 r0 = new p.s621
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            java.util.Iterator r5 = r0.a
            p.hm5.M(r6)
            goto L56
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r4)
            r4 = 0
            return r4
        L2e:
            p.hm5.M(r6)
            java.util.Iterator r5 = r5.iterator()
        L35:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L5f
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r4.d
            p.op31 r1 = (p.op31) r1
            java.util.List r6 = java.util.Collections.singletonList(r6)
            r0.a = r5
            r0.d = r2
            java.lang.Object r6 = p.op31.a(r1, r6, r0)
            p.d9n r1 = p.d9n.a
            if (r6 != r1) goto L56
            return r1
        L56:
            p.py21 r6 = (p.py21) r6
            boolean r6 = r6 instanceof p.ly21
            if (r6 == 0) goto L35
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L5f:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mzr0.k(java.util.List, p.onm):java.lang.Object");
    }

    public void l(LayoutInflater layoutInflater, ScrollView scrollView) {
        View viewInflate = layoutInflater.inflate(2131626090, (ViewGroup) scrollView, true);
        this.f = (TextView) viewInflate.findViewById(2131430741);
        this.e = (ProgressBar) viewInflate.findViewById(2131430737);
        this.g = viewInflate.findViewById(2131430740);
        ((Button) viewInflate.findViewById(2131430739)).setOnClickListener(new na41(this, (byte) 0));
        ((Button) viewInflate.findViewById(2131430736)).setOnClickListener(new na41(this, (byte) 1));
    }

    public Completable m() {
        s45 s45Var = (zle1) this.f;
        HashMap map = (HashMap) this.c;
        Uri uri = (Uri) this.a;
        gyv0 gyv0Var = (gyv0) map.get(uri);
        if (gyv0Var == null) {
            Logger.k("onPreparePlaySuccess called without a corresponding pending search response for uri = " + uri + ".", new Object[0]);
            return new CompletableFromAction(new wqd0(this, (byte) 20));
        }
        t45 t45Var = (t45) this.e;
        if (t45Var != null && s45Var != null) {
            t45Var.g("prepare-uri");
            s45Var.b(t45Var.e());
            this.e = null;
        }
        Objects.toString(uri);
        gyv0Var.a = true;
        Completable completableA = CompletableEmpty.a;
        if (gyv0Var.b) {
            SpeakeasyDualResponse speakeasyDualResponse = gyv0Var.c;
            if (speakeasyDualResponse != null) {
                completableA = ((bmk1) this.d).a((SearchEndpointRequest) this.b, speakeasyDualResponse, (zle1) this.f, (t45) this.e, (VoiceAssistantLoggingContext) this.g);
            } else {
                Logger.d("onPreparePlaySuccess got a null search response.", new Object[0]);
            }
            map.remove(uri);
        }
        return completableA;
    }

    public void n(String str, boolean z, boolean z2) {
        fn31.T(cto1.q((dg30) this.a), (o8n) null, 0, new es9(this, str, z2, z, (lnm) null, (byte) 4), 3);
    }

    public int o() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00be  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object p(String str, tv80 tv80Var, onm onmVar) throws Throwable {
        qs71 qs71Var;
        Throwable th;
        rzq rzqVar;
        ylt0 ylt0Var;
        String str2;
        rzq rzqVar2;
        tv80 tv80Var2;
        y4m y4mVar;
        r840 r840Var;
        plt0 plt0Var;
        ast0 ast0Var;
        if (onmVar instanceof qs71) {
            qs71Var = (qs71) onmVar;
            int i = qs71Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                qs71Var.g = i - Integer.MIN_VALUE;
            } else {
                qs71Var = new qs71(this, onmVar);
            }
        } else {
            qs71Var = new qs71(this, onmVar);
        }
        qs71 qs71Var2 = qs71Var;
        Object obj = qs71Var2.e;
        int i2 = qs71Var2.g;
        d9n d9nVar = d9n.a;
        if (i2 != 0) {
            if (i2 == 1) {
                ylt0Var = qs71Var2.d;
                rzqVar2 = qs71Var2.c;
                tv80Var = qs71Var2.b;
                str2 = qs71Var2.a;
                try {
                    hm5.M(obj);
                    tv80Var2 = tv80Var;
                    mmr0 mmr0Var = (mmr0) obj;
                    y4mVar = (y4m) mmr0Var.a;
                    r840Var = (r840) mmr0Var.b;
                    plt0Var = new plt0(str2);
                    ast0Var = ast0.c;
                    qs71Var2.a = null;
                    qs71Var2.b = null;
                    qs71Var2.c = rzqVar2;
                    qs71Var2.d = null;
                    qs71Var2.g = 2;
                    if (ylt0.b(ylt0Var, plt0Var, ast0Var, r840Var, y4mVar, tv80Var2, (ijk0) null, qs71Var2, 96) != d9nVar) {
                        rzqVar = rzqVar2;
                    }
                    return d9nVar;
                } catch (Throwable th2) {
                    rzq rzqVar3 = rzqVar2;
                    th = th2;
                    rzqVar = rzqVar3;
                    rzqVar.l();
                    throw th;
                }
            }
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rzqVar = qs71Var2.c;
            try {
                hm5.M(obj);
            } catch (Throwable th3) {
                th = th3;
                rzqVar.l();
                throw th;
            }
            rzqVar.l();
            return rih1.a;
        }
        hm5.M(obj);
        j3r j3rVar = rzq.y;
        rzq rzqVarF = l2p1.f(((r2r) this.b).a("android-entitysegments-playback", new q961(this, (byte) 25)));
        ylt0 ylt0VarR = ((r0s0) this.e).r(new wlt0((ruz) this.g));
        try {
            xd1 xd1Var = new xd1(rzqVarF, this, str, (lnm) null);
            qs71Var2.a = str;
            qs71Var2.b = tv80Var;
            qs71Var2.c = rzqVarF;
            qs71Var2.d = ylt0VarR;
            qs71Var2.g = 1;
            Object objS = smo1.s(xd1Var, qs71Var2);
            if (objS != d9nVar) {
                obj = objS;
                ylt0Var = ylt0VarR;
                str2 = str;
                rzqVar2 = rzqVarF;
                tv80Var2 = tv80Var;
                mmr0 mmr0Var2 = (mmr0) obj;
                y4mVar = (y4m) mmr0Var2.a;
                r840Var = (r840) mmr0Var2.b;
                plt0Var = new plt0(str2);
                ast0Var = ast0.c;
                qs71Var2.a = null;
                qs71Var2.b = null;
                qs71Var2.c = rzqVar2;
                qs71Var2.d = null;
                qs71Var2.g = 2;
                if (ylt0.b(ylt0Var, plt0Var, ast0Var, r840Var, y4mVar, tv80Var2, (ijk0) null, qs71Var2, 96) != d9nVar) {
                    rzqVar = rzqVar2;
                    rzqVar.l();
                    return rih1.a;
                }
            }
            return d9nVar;
        } catch (Throwable th4) {
            th = th4;
            rzqVar = rzqVarF;
            rzqVar.l();
            throw th;
        }
    }

    public h190 q(String str) {
        return new h190(new lt20(new m441(new hgo0(this, str, (sq4) ((blp) this.f).get(), (lnm) null, (byte) 12)), new w1e0(3, (lnm) null, (byte) 23), (byte) 0), (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:43:0x009b  */
    /* JADX WARN: Code duplicated, block: B:45:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ee, code lost:
    
        if (r0 == r8) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object r(java.lang.String r25, java.lang.String r26, p.onm r27) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mzr0.r(java.lang.String, java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object t(b1k0 b1k0Var, z0k0 z0k0Var, onm onmVar) throws Exception {
        cd41 cd41Var;
        z0k0 z0k0Var2;
        alg1 alg1Var = (alg1) this.f;
        if (onmVar instanceof cd41) {
            cd41Var = (cd41) onmVar;
            int i = cd41Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cd41Var.d = i - Integer.MIN_VALUE;
            } else {
                cd41Var = new cd41(this, onmVar);
            }
        } else {
            cd41Var = new cd41(this, onmVar);
        }
        Object objY = cd41Var.b;
        int i2 = cd41Var.d;
        phc byteString = null;
        if (i2 == 0) {
            hm5.M(objY);
            x0k0 x0k0VarX = x(b1k0Var, z0k0Var.a);
            ykg1 ykg1VarF = alg1Var.f(x0k0VarX);
            lhg1 lhg1Var = b1k0Var.d;
            lhg1 lhg1Var2 = x0k0VarX.a;
            lhg1 lhg1Var3 = x0k0VarX.d;
            cbk0 cbk0Var = (cbk0) alg1Var.b;
            String str = cbk0Var.a;
            String str2 = cbk0Var.b.b;
            if (lhg1Var != null) {
                wl61 wl61VarN = SetTransition.n();
                wl61VarN.r(kkg1.c(lhg1Var));
                if (lhg1Var2 != null) {
                    wl61VarN.s(kkg1.c(lhg1Var2));
                } else {
                    wl61VarN.n(kkg1.c(lhg1Var3));
                }
                byteString = ((SetTransition) wl61VarN.build()).toByteString();
            }
            ykg1 ykg1Var = new ykg1(str, str2, byteString);
            geo0 geo0Var = geo0.b;
            hgo0 hgo0Var = new hgo0(this, ykg1VarF, z0k0Var, ykg1Var, (lnm) null);
            cd41Var.a = z0k0Var;
            cd41Var.d = 1;
            objY = fn31.Y(geo0Var, hgo0Var, cd41Var);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
            z0k0Var2 = z0k0Var;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z0k0Var2 = cd41Var.a;
            hm5.M(objY);
        }
        Exception exc = (Exception) objY;
        op71.x(cd41Var.getContext());
        if (exc == null) {
            return z0k0Var2.a;
        }
        throw exc;
    }

    public void u(kf kfVar, kf kfVar2) {
        if (kfVar == null) {
            kfVar = n521.e1;
        }
        this.b = kfVar;
        if (kfVar2 == null) {
            kfVar2 = oa41.b;
        }
        this.c = kfVar2;
    }

    public void v(String str) {
        qes qesVar = (qes) this.c;
        lzn0 lzn0Var = (lzn0) this.d;
        Bundle bundleG = cy30.g("ARGUMENT_URI", str);
        if (((u15) this.e).a()) {
            if (!lzn0Var.j((Activity) this.g)) {
                a1r0.j((a1r0) this.f, "spotify:internal:sleep-timer-nudge", (String) null, bundleG, false, 10);
                return;
            } else {
                qesVar.c();
                lzn0Var.i(new dwn0("spotify:internal:sleep-timer-nudge", "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null), bundleG);
                return;
            }
        }
        th30 th30Var = (th30) this.a;
        ia91 ia91VarA = ((uww0) this.b).a();
        ia91VarA.T0(bundleG);
        if (th30Var.U()) {
            return;
        }
        qesVar.c();
        ia91VarA.g1(th30Var, "SleepTimerNudgeBottomSheetFragment");
    }

    public void w() {
        kt91 kt91Var = (kt91) this.e;
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131954352});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        er91 er91Var = new er91((fs91) null, "", 2131954352, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
        if (kt91Var.g()) {
            kt91Var.k(er91Var);
        } else {
            kt91Var.o(er91Var);
        }
    }

    public x0k0 x(b1k0 b1k0Var, String str) {
        lhg1 lhg1Var = b1k0Var.a;
        lhg1 lhg1VarA = lhg1Var != null ? A(lhg1Var, str) : null;
        w0k0 w0k0Var = b1k0Var.b;
        lhg1 lhg1Var2 = b1k0Var.c;
        return new x0k0(lhg1VarA, w0k0Var, lhg1Var2 != null ? A(lhg1Var2, str) : null, A(b1k0Var.e, str));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0086  */
    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    public Object y(String str, String str2, onm onmVar) {
        r721 r721Var;
        String str3;
        String str4;
        String str5;
        String str6;
        m231 m231Var;
        kt91 kt91Var = (kt91) this.e;
        r630 r630Var = (r630) this.d;
        if (onmVar instanceof r721) {
            r721Var = (r721) onmVar;
            int i = r721Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                r721Var.e = i - Integer.MIN_VALUE;
            } else {
                r721Var = new r721(this, onmVar);
            }
        } else {
            r721Var = new r721(this, onmVar);
        }
        Object obj = r721Var.c;
        int i2 = r721Var.e;
        m231 m231Var2 = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                try {
                    String strS = s(str);
                    q8n q8nVar = (q8n) this.g;
                    o721 o721Var = new o721(this, strS, (lnm) null, (byte) 1);
                    str3 = str;
                    try {
                        r721Var.a = str3;
                        str4 = str2;
                        try {
                            r721Var.b = str4;
                            r721Var.e = 1;
                            Object objY = fn31.Y(q8nVar, o721Var, r721Var);
                            d9n d9nVar = d9n.a;
                            if (objY == d9nVar) {
                                return d9nVar;
                            }
                            str5 = str3;
                            str6 = str4;
                            str3 = str5;
                            m231Var = m231Var2;
                        } catch (Throwable th) {
                            th = th;
                            m231Var = new m231(th);
                            str6 = str4;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str4 = str2;
                        m231Var = new m231(th);
                        str6 = str4;
                        if (m231Var instanceof m231) {
                            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961148});
                            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                            kt91Var.k(new er91((fs91) null, "", 2131961148, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                        } else {
                            if (r630Var.c(str3) == null) {
                                r630Var.a(new i430(str3, 30, false));
                            }
                            r630Var.k(str3, false);
                            kt91Var.k(new er91((fs91) null, ((Activity) this.a).getString(2131961153, str6), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                        }
                        return m231Var2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str3 = str;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str6 = r721Var.b;
                str5 = r721Var.a;
                try {
                    hm5.M(obj);
                    str3 = str5;
                    m231Var = m231Var2;
                } catch (Throwable th4) {
                    th = th4;
                    str3 = str5;
                    str4 = str6;
                    m231Var = new m231(th);
                    str6 = str4;
                }
            }
            if (m231Var instanceof m231) {
                if (r630Var.c(str3) == null) {
                    r630Var.a(new i430(str3, 30, false));
                }
                r630Var.k(str3, false);
                kt91Var.k(new er91((fs91) null, ((Activity) this.a).getString(2131961153, str6), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
            } else {
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961148});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131961148, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
            }
            return m231Var2;
        } catch (CancellationException e) {
            throw e;
        }
    }

    public CompletableAndThenCompletable z(zwu0 zwu0Var) {
        return new CompletableFromAction(new tt60(this, zwu0Var, (byte) 17)).c(((j23) ((c23) this.c)).i(zwu0Var.a, zwu0Var.k, zwu0Var.d, zwu0Var.e).h(mux0.g).o(Functions.h));
    }

    public /* synthetic */ mzr0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.f = obj5;
        this.e = obj6;
        this.g = obj7;
    }

    public mzr0(Scheduler scheduler, Scheduler scheduler2, PublishSubject publishSubject, yxk0 yxk0Var, ywp ywpVar) {
        this.a = scheduler;
        this.b = scheduler2;
        this.c = publishSubject;
        this.d = yxk0Var;
        this.f = ywpVar;
        this.g = new idd1(new g521(this, (byte) 25));
    }

    public mzr0(Context context, mka mkaVar, xov0 xov0Var, avw0 avw0Var, tvv0 tvv0Var, tvv0 tvv0Var2, yrv0 yrv0Var, yrv0 yrv0Var2, dxz0 dxz0Var, wdm wdmVar) {
        this.a = xov0Var;
        this.b = tvv0Var;
        this.c = tvv0Var2;
        this.d = yrv0Var;
        this.f = yrv0Var2;
        this.e = dxz0Var;
        this.g = wdmVar;
    }

    public mzr0(kt91 kt91Var, r5s r5sVar, ip91 ip91Var, q8n q8nVar, e9q e9qVar, iac0 iac0Var, lik1 lik1Var, n6r0 n6r0Var, agc0 agc0Var) {
        this.a = kt91Var;
        this.b = r5sVar;
        this.c = ip91Var;
        this.d = q8nVar;
        this.f = agc0Var;
        this.e = new n381(lik1Var, n6r0Var, (i8h1) e9qVar.a.a.A5.get());
        this.g = new vku();
        iac0Var.getLifecycle().a(new fu7(this, (byte) 1));
    }

    public mzr0(dg30 dg30Var, nt21 nt21Var) {
        this.a = nt21Var;
        this.b = n521.c1;
        this.c = n521.d1;
        mw40 mw40Var = new mw40(dg30Var, this);
        mw40Var.e = false;
        this.d = mw40Var.b();
    }

    public mzr0(i8h1 i8h1Var, u9c0 u9c0Var, String str, iyc0 iyc0Var, kt91 kt91Var, zwz0 zwz0Var) {
        this.a = i8h1Var;
        this.b = u9c0Var;
        this.c = str;
        this.d = iyc0Var;
        this.f = kt91Var;
        this.e = zwz0Var;
    }

    public /* synthetic */ mzr0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.f = obj5;
        this.e = obj6;
        this.g = obj7;
    }

    public mzr0(iyc0 iyc0Var, li9 li9Var, c23 c23Var, vfu0 vfu0Var, op31 op31Var, mka mkaVar, vhc vhcVar, jxa jxaVar, PublishSubject publishSubject) {
        this.a = iyc0Var;
        this.b = li9Var;
        this.c = c23Var;
        this.d = vfu0Var;
        this.f = op31Var;
        this.e = jxaVar;
        this.g = publishSubject;
    }

    public mzr0(ConstraintLayout constraintLayout, EncoreButton encoreButton, TextView textView, ConstraintLayout constraintLayout2, View view, SpotifyIconView spotifyIconView, TextView textView2, TextView textView3) {
        this.a = encoreButton;
        this.b = textView;
        this.c = constraintLayout2;
        this.d = view;
        this.f = spotifyIconView;
        this.e = textView2;
        this.g = textView3;
    }

    public mzr0(ConstraintLayout constraintLayout, ViewStub viewStub, FrameLayout frameLayout, TextView textView, ArtworkView artworkView, TextView textView2, ConstraintLayout constraintLayout2, ProgressBar progressBar, VideoSurfaceView videoSurfaceView) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = artworkView;
        this.d = textView2;
        this.f = constraintLayout2;
        this.e = progressBar;
        this.g = videoSurfaceView;
    }

    public mzr0(ConstraintLayout constraintLayout, AmbiguousDeviceSelectView ambiguousDeviceSelectView, EncoreButton encoreButton, ComposeView composeView, EncoreButton encoreButton2, DisconnectedView disconnectedView, ErrorView errorView, ProgressBar progressBar, ManualSelectView manualSelectView) {
        this.a = ambiguousDeviceSelectView;
        this.b = encoreButton;
        this.c = encoreButton2;
        this.d = disconnectedView;
        this.f = errorView;
        this.e = progressBar;
        this.g = manualSelectView;
    }

    public mzr0() {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f = new ArrayList();
        this.e = new HashSet();
        this.g = cqu.v;
    }
}
