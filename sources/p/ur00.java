package p;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.encoremobile.facepile.FacePileView;
import com.spotify.legacyglue.icons.SpotifyIconView;
import com.spotify.player.esperanto.proto.EsContextPlayerOptions;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.esperanto.proto.EsPlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.player.esperanto.proto.EsSkipToTrack;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.stream_reporting_attribution.proto.StreamReportingAttributionOuterClass;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public class ur00 implements Function, Function3, elf, o2r0 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public ur00(Layout layout) {
        this.a = (byte) 17;
        this.b = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iV0 = ihc1.v0(((Layout) this.b).getText(), '\n', length, 4);
            length = iV0 < 0 ? ((Layout) this.b).getText().length() : iV0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.b).getText().length());
        this.c = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.d = arrayList2;
        this.e = new boolean[((ArrayList) this.c).size()];
        ((ArrayList) this.c).size();
    }

    public static xk90 E(List list, j2i j2iVar, wmy wmyVar) {
        if (list.isEmpty()) {
            return null;
        }
        return new xk90(list, j2iVar, wmyVar);
    }

    public static trc0 h(t4u0 t4u0Var) {
        List list = t4u0Var.c;
        return new trc0((PlaylistRequestDecorationPolicy) null, t4u0Var.a, t4u0Var.b, false, t4u0Var.j, hqz0.a, t4u0Var.e == xzc0.b ? prc0.b : prc0.a, 0, list, 137);
    }

    public static ArrayList r(List list) {
        List<bl90> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (bl90 bl90Var : list2) {
            arrayList.add(new s1v0(bl90Var.a, bl90Var.b.a));
        }
        return arrayList;
    }

    public void A(int i, String str) {
        String str2;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-gen-alpha-parental-control-managed-account-allowlisting-requests";
        x6h1VarI.f = "1.1.1";
        x6h1VarI.g = "22.0.0";
        y6h1 y6h1VarA = x6h1VarI.a();
        List listSingletonList = Collections.singletonList("parental-control/review-allowlisting-requests");
        x6h1 x6h1VarC = y6h1VarA.c();
        if (i == 1) {
            str2 = "approve_artist";
        } else if (i == 2) {
            str2 = "approve_request";
        } else {
            if (i != 3) {
                throw null;
            }
            str2 = "decline_request";
        }
        x6h1VarC.i.add(new a7h1("allowlisting_action_failed_snackbar", str2, (Integer) null, str, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA2 = x6h1VarC.a();
        i8h1 i8h1Var = (i8h1) ((idd1) this.f).getValue();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA2;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = listSingletonList;
        i8h1Var.f(k7h1Var.a(), (Set) null);
        ((kt91) this.d).k(new er91((fs91) null, ((Resources) this.c).getString(2131952325), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }

    public void B(String str, String str2, int i, String str3) {
        String str4 = nik1.V5.b("spotify:internal:parental-control:child:" + str + ":manage-content:approved").a;
        sqk0 sqk0Var = new sqk0(new v8l0(), i, str2);
        ((i8h1) ((idd1) this.f).getValue()).f(sqk0Var.e(), (Set) null);
        ((kt91) this.d).k(new er91((fs91) null, str3, (Integer) null, ((Resources) this.c).getString(2131952310), (Integer) null, new kw6(this, sqk0Var, str4, (byte) 12), (cvr) null, (xq91) null, false));
    }

    public void C() {
        j0d1 j0d1VarB = guo1.B();
        fns fnsVar = igu.a;
        llm llmVarE = smo1.e(flo1.l(j0d1VarB, pyf0.a.f));
        this.f = llmVarE;
        ((bpb1) this.d).m((Object) null, Boolean.TRUE);
        fn31.T(llmVarE, (o8n) null, 0, new p6d0(this, (lnm) null, (byte) 24), 3);
    }

    public void D() {
        ((bpb1) this.d).m((Object) null, Boolean.FALSE);
        llm llmVar = (llm) this.f;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        this.f = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object a(boolean z, onm onmVar) {
        pdd0 pdd0Var;
        Exception e;
        boolean z2;
        bpb1 bpb1Var = (bpb1) this.e;
        if (onmVar instanceof pdd0) {
            pdd0Var = (pdd0) onmVar;
            int i = pdd0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pdd0Var.d = i - Integer.MIN_VALUE;
            } else {
                pdd0Var = new pdd0(this, onmVar);
            }
        } else {
            pdd0Var = new pdd0(this, onmVar);
        }
        Object obj = pdd0Var.b;
        int i2 = pdd0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                boolean zBooleanValue = ((Boolean) bpb1Var.getValue()).booleanValue();
                Boolean boolValueOf = Boolean.valueOf(z);
                bpb1Var.getClass();
                bpb1Var.m((Object) null, boolValueOf);
                try {
                    mdd0 mdd0Var = (vcd0) this.d;
                    String str = (String) this.b;
                    boolean z3 = !z;
                    try {
                        pdd0Var.a = zBooleanValue;
                        pdd0Var.d = 1;
                        Object objJ = mdd0Var.j(str, pdd0Var, z3);
                        d9n d9nVar = d9n.a;
                        if (objJ == d9nVar) {
                            return d9nVar;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        z2 = zBooleanValue;
                        Logger.e(e, "Failed to update listening activity restriction", new Object[0]);
                        Boolean boolValueOf2 = Boolean.valueOf(z2);
                        bpb1Var.getClass();
                        bpb1Var.m((Object) null, boolValueOf2);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = pdd0Var.a;
                try {
                    hm5.M(obj);
                } catch (Exception e4) {
                    e = e4;
                    Logger.e(e, "Failed to update listening activity restriction", new Object[0]);
                    Boolean boolValueOf3 = Boolean.valueOf(z2);
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, boolValueOf3);
                }
            }
            return rih1.a;
        } catch (CancellationException e5) {
            throw e5;
        }
    }

    public Object apply(Object obj) {
        spq0 spq0VarAudioStream;
        AudioStream audioStream;
        kqz kqzVar;
        SkipToTrack skipToTrack;
        spq0 spq0VarTrackUri;
        switch (this.a) {
            case 1:
                bo91 bo91Var = (bo91) ((z410) this.b).i.get();
                String str = (String) this.c;
                String str2 = (String) ((LoggingParams) this.d).interactionId().b();
                spq0 spq0VarSkipTo = ((PreparePlayOptions) obj).skipTo();
                kqz kqzVar2 = null;
                String str3 = (spq0VarSkipTo == null || (skipToTrack = (SkipToTrack) spq0VarSkipTo.h()) == null || (spq0VarTrackUri = skipToTrack.trackUri()) == null) ? null : (String) spq0VarTrackUri.h();
                PlayOrigin playOrigin = (PlayOrigin) this.e;
                zpz zpzVarY = EsPlayOrigin.PlayOrigin.y();
                zpzVarY.s(playOrigin.featureIdentifier());
                zpzVarY.t(playOrigin.featureVersion());
                zpzVarY.w(playOrigin.viewUri());
                zpzVarY.r(playOrigin.externalReferrer());
                zpzVarY.q(playOrigin.deviceIdentifier());
                zpzVarY.n(playOrigin.featureClasses().b());
                zpzVarY.v(playOrigin.restrictionIdentifier());
                EsPlayOrigin.PlayOrigin playOriginBuild = zpzVarY.build();
                PreparePlayOptions preparePlayOptions = (PreparePlayOptions) this.f;
                if (preparePlayOptions != null && (spq0VarAudioStream = preparePlayOptions.audioStream()) != null && (audioStream = (AudioStream) spq0VarAudioStream.h()) != null) {
                    int i = e1c0.a[audioStream.ordinal()];
                    if (i == 1) {
                        kqzVar = kqz.c;
                    } else {
                        if (i != 2) {
                            eg.o();
                            return null;
                        }
                        kqzVar = kqz.b;
                    }
                    kqzVar2 = kqzVar;
                }
                return bo91.a(bo91Var, str, str2, str3, (String) null, playOriginBuild, kqzVar2, 8).x(new ceh()).onErrorReturnItem(new beh("Failure"));
            case 10:
                zs60 zs60Var = (zs60) obj;
                return ((g0l) this.b).j().map(mif1.e1).filter(va20.e).firstOrError().map(kc20.f).timeout(5000L, TimeUnit.MILLISECONDS, (Scheduler) this.c, Single.error(new TimeoutException())).flatMapObservable(new o860((n381) this.d, zs60Var, (k9r) this.e, (nfa0) this.f, (byte) 2)).onErrorReturn(new jl00(zs60Var, (byte) 16));
            default:
                return new wpd0((String) this.b, (String) this.c, (String) this.d, (String) this.e, (xpd0) null, new nqd0((String) this.f, (String) obj), (String) null, 80);
        }
    }

    public mr20 b() {
        return hu20.e(new fu20((ve01) this.f, new e9c0(this, (lnm) null, (byte) 7), (byte) 1), new ndd0((byte) 0, null, this));
    }

    public void c(c0b1 c0b1Var, zob1 zob1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1811445864);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(c0b1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(zob1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            s24 s24Var = (s24) this.b;
            woa woaVarA = ((g9c0) this.d).a((iac0) x340Var.k(jfe0.a));
            kma kmaVar = (kma) this.c;
            fv0 fv0Var = (fv0) this.e;
            boolean z = c0b1Var.g;
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new zi50(this, (byte) 5);
                x340Var.s0(objT);
            }
            s24Var.o(c0b1Var, (iu30) objT, fv0Var, woaVarA, kmaVar, iu30Var, zob1Var, (qim0) null, z, x340Var, (i2 & 14) | ((i2 << 9) & 458752) | ((i2 << 15) & 3670016));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(i, this, c0b1Var, zob1Var, iu30Var, (byte) 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    public Bidi d(int i) {
        Bidi bidi;
        Layout layout = (Layout) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        boolean[] zArr = (boolean[]) this.e;
        if (zArr[i]) {
            return (Bidi) arrayList2.get(i);
        }
        int iIntValue = i == 0 ? 0 : ((Number) arrayList.get(i - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i)).intValue();
        int i2 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.f;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(p(i))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.f;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f = cArr2;
        return bidi;
    }

    public tqd0 e() {
        String str = (String) this.d;
        if (str == null || ihc1.y0(str)) {
            hhg1.n("Live sharing dialog requires a non-null and non-blank title");
            return null;
        }
        String str2 = (String) this.e;
        if (str2 == null || ihc1.y0(str2)) {
            hhg1.n("Live sharing dialog requires a non-null and non-blank subtitle");
            return null;
        }
        String str3 = (String) this.f;
        if (str3 == null || ihc1.y0(str3)) {
            hhg1.n("Live sharing dialog requires a positive button text");
            return null;
        }
        k350 k350Var = new k350();
        Bundle bundleF = pzm.f("title", str, "subtitle", str2);
        bundleF.putString("positive_button_text", str3);
        k350Var.T0(bundleF);
        k350Var.W1 = (Function0) this.b;
        k350Var.X1 = (Function0) this.c;
        return k350Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(onm onmVar) {
        y290 y290Var;
        if (onmVar instanceof y290) {
            y290Var = (y290) onmVar;
            int i = y290Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                y290Var.c = i - Integer.MIN_VALUE;
            } else {
                y290Var = new y290(this, onmVar);
            }
        } else {
            y290Var = new y290(this, onmVar);
        }
        Object objInvoke = y290Var.a;
        int i2 = y290Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objInvoke);
                fpo fpoVar = (fpo) this.d;
                y290Var.c = 1;
                objInvoke = fpoVar.invoke(y290Var);
                d9n d9nVar = d9n.a;
                if (objInvoke == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objInvoke);
            }
            return (String) objInvoke;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Failed to capture internal issue screenshot", new Object[0]);
            return null;
        }
    }

    public j4m g(nhr0 nhr0Var, Bundle bundle) {
        k241 k241Var = (k241) ((w6e0) this.b).b;
        u7r0 u7r0Var = (u7r0) this.e;
        iu30 iu30Var = (iu30) this.f;
        a8e0 a8e0Var = (a8e0) this.c;
        return new r6e0(nhr0Var, k241Var, u7r0Var, iu30Var, new c4z(2, a8e0Var.b, i1n0.class, "createViewBuilder", "createViewBuilder(Lcom/spotify/navigation/identifier/ViewUri$Provider;Lcom/spotify/ubi/pageidentifier/PageIdentifierProvider;)Lcom/spotify/tome/pageloader/PageLoaderView$Builder;", 0, (byte) 24), a8e0Var.c, ((q7r0) this.d).d.b().a());
    }

    public float i(int i, boolean z) {
        Layout layout = (Layout) this.b;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public mr20 isEnabled() {
        return new x010(new mnc0((ve01) this.f, (byte) 10), (lmf) this.c, new ce2(3, (lnm) null, (byte) 25), (byte) 1);
    }

    public mr20 j() {
        return (mr20) this.d;
    }

    public n2r k() {
        return (w6e0) this.b;
    }

    public float l(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.b;
        if (!z2) {
            return i(i, z);
        }
        int iN = iho1.n(layout, i, z2);
        int lineStart = layout.getLineStart(iN);
        int lineEnd = layout.getLineEnd(iN);
        if (i != lineStart && i != lineEnd) {
            return i(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return i(i, z);
        }
        int iO = o(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(p(iO))) == -1;
        int iQ = q(lineEnd, lineStart);
        int iP = p(iO);
        int i4 = lineStart - iP;
        int i5 = iQ - iP;
        Bidi bidiD = d(iO);
        Bidi bidiCreateLineBidi = bidiD != null ? bidiD.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(iN) : layout.getLineRight(iN);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        ilb0[] ilb0VarArr = new ilb0[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            ilb0VarArr[i6] = new ilb0(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, ilb0VarArr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (ilb0VarArr[i8].a == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == ilb0VarArr[i3].c) ? !z3 : z3;
            if (i3 == 0 && z4) {
                return layout.getLineLeft(iN);
            }
            if (i3 != runCount - 1 || z4) {
                return z4 ? layout.getPrimaryHorizontal(ilb0VarArr[i3 - 1].a) : layout.getPrimaryHorizontal(ilb0VarArr[i3 + 1].a);
            }
            return layout.getLineRight(iN);
        }
        int iQ2 = i > iQ ? q(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (ilb0VarArr[i9].b == iQ2) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == ilb0VarArr[i2].c) ? z3 : !z3;
        if (i2 == 0 && z5) {
            return layout.getLineLeft(iN);
        }
        if (i2 != runCount - 1 || z5) {
            return z5 ? layout.getPrimaryHorizontal(ilb0VarArr[i2 - 1].b) : layout.getPrimaryHorizontal(ilb0VarArr[i2 + 1].b);
        }
        return layout.getLineRight(iN);
    }

    public int m(int i) {
        Layout layout = (Layout) this.b;
        return q(layout.getLineEnd(i), layout.getLineStart(i));
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        kcc0 kcc0Var = (kcc0) obj;
        c221 c221Var = (c221) obj2;
        qrg1 qrg1Var = (qrg1) obj3;
        nfc0 nfc0Var = (nfc0) this.b;
        lik1 lik1Var = (lik1) this.c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        boolean z = ((ofc0) this.f).a;
        String str3 = kcc0Var.a;
        ltm1 ltm1Var = nfc0Var.b;
        dg30 dg30Var = nfc0Var.a;
        ltm1Var.getClass();
        igm igmVar = new igm(str2, new vfm(ltm1.b(dg30Var)), str3);
        smc0 smc0VarN = k4p1.n();
        if (nfc0Var.k.b()) {
            smc0VarN.add(nfc0Var.d.c(4, str, "https://message-editor.scdn.co/1e43b2cb-b1fa-4f1c-a118-9afa3d42057d"));
        }
        int i = kcc0Var.c;
        boolean z2 = true;
        e2t0 e2t0Var = e2t0.Y;
        if (i == 1) {
            smc0VarN.add(nfc0Var.i.i(str, e2t0Var));
        } else if (i != 4) {
            smc0VarN.add(nfc0Var.g.g(str, e2t0Var, lik1Var));
        }
        if (kcc0Var.b) {
            smc0VarN.add(nfc0Var.l.a(str));
        }
        if (z) {
            zeu zeuVar = nfc0Var.h;
            xwp0 xwp0Var = kcc0Var.d;
            boolean z3 = qrg1Var.a;
            if (!(xwp0Var instanceof vwp0) && !(xwp0Var instanceof jwp0) && !(xwp0Var instanceof hwp0)) {
                z2 = false;
            }
            smc0VarN.add(new jhm("liked_songs_download", z2 ? umx.c : tmx.c, (fhm) null, Integer.valueOf(z2 ? 2131954466 : 2131954365), (String) null, false, z3 ? new tm81(2, 6, "liked_songs_download", (iu30) null, false) : null, new ihm(new ygm(2), z2 ? hhm.b : hhm.a, new ghm(wvu.t, new cl1(z2, str, (byte) 12)), new gh1(z2, zeuVar, str, lik1Var, (byte) 7)), 116));
        }
        if (z && c221Var.a) {
            smc0VarN.add(nfc0Var.e.b(str, qrg1Var.b ? 2 : 0, c221Var.b));
        }
        return new kjm(igmVar, k4p1.k(smc0VarN), 4);
    }

    public int o(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.c;
        int I = p7h.I(arrayList, Integer.valueOf(i));
        int i2 = I < 0 ? -(I + 1) : I + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public int p(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.c).get(i - 1)).intValue();
    }

    public int q(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.b).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((u890.q(cCharAt, 8192) < 0 || u890.q(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void s(String str) {
        ((cih0) this.c).notifyChildrenChanged(str);
        ((jih0) this.e).e.post(new xwn1(this, str, false, (byte) 27));
    }

    public IBinder t(Intent intent) {
        return ((cih0) this.c).onBind(intent);
    }

    public void u() {
        cih0 cih0Var = new cih0(this, (jih0) this.f);
        this.c = cih0Var;
        cih0Var.onCreate();
    }

    public Object v(String str, gxo1 gxo1Var, String str2, EsLoggingParams.LoggingParams loggingParams, t4u0 t4u0Var, onm onmVar) {
        boolean zBooleanValue;
        lqz lqzVarS = EsPreparePlayOptions.PreparePlayOptions.s();
        lqzVarS.s(gxo1Var instanceof usc0);
        boolean z = gxo1Var instanceof vsc0;
        xzc0 xzc0Var = xzc0.a;
        if (z && t4u0Var.e != xzc0Var) {
            wzc0 wzc0Var = ((vsc0) gxo1Var).b;
            wrz wrzVarP = EsSkipToTrack.SkipToTrack.p();
            if (wzc0Var instanceof vzc0) {
                wrzVarP.t(((vzc0) wzc0Var).a);
            } else {
                if (!(wzc0Var instanceof uzc0)) {
                    eg.o();
                    return null;
                }
                wrzVarP.s(((uzc0) wzc0Var).a);
            }
            lqzVarS.C(wrzVarP.build());
            wzc0Var.getMetadata().getClass();
        }
        imz imzVarO = EsContextPlayerOptions.ContextPlayerOptionOverrides.o();
        ppz ppzVarN = EsOptional.OptionalBoolean.n();
        mp91 mp91Var = t4u0Var.h;
        xzc0 xzc0Var2 = t4u0Var.e;
        Boolean bool = mp91Var.a;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = xzc0Var2 == xzc0Var;
        }
        ppzVarN.n(zBooleanValue);
        imzVarO.u(ppzVarN);
        Boolean bool2 = t4u0Var.h.b;
        if (bool2 != null) {
            String str3 = bool2.booleanValue() ? "RECOMMENDATION" : "NONE";
            imzVarO.q("context_enhancement", str3);
            imzVarO.q("original_enhancement_mode", str3);
        }
        imzVarO.n(t4u0Var.g);
        lqzVarS.x(imzVarO.build());
        lqzVarS.n(t4u0Var.d);
        EsPreparePlayOptions.PreparePlayOptions preparePlayOptionsBuild = lqzVarS.build();
        xkg0 xkg0Var = new xkg0();
        xkg0Var.putAll(t4u0Var.i);
        if (xzc0Var2 == xzc0.b) {
            xkg0Var.put("license", "mod");
        }
        xkg0 xkg0VarB = xkg0Var.b();
        boolean z2 = t4u0Var.f;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (z2) {
            ua91 ua91Var = (ua91) this.f;
            Object objI = fc11.i(bo91.a((bo91) ua91Var.d, (String) ua91Var.b, str2, (String) null, preparePlayOptionsBuild.q().o(), (EsPlayOrigin.PlayOrigin) ua91Var.c, (kqz) null, 36), onmVar);
            if (objI != d9nVar) {
                objI = rih1Var;
            }
            if (objI == d9nVar) {
                return objI;
            }
        } else {
            xrc0 xrc0Var = (xrc0) this.c;
            EsPlayOrigin.PlayOrigin playOrigin = (EsPlayOrigin.PlayOrigin) this.e;
            preparePlayOptionsBuild.getClass();
            Object objB = xrc0.b(xrc0Var, str, h(t4u0Var), preparePlayOptionsBuild, playOrigin, (EsPlayOptions.PlayOptions) null, xkg0VarB, loggingParams, (ayc0) null, onmVar, 144);
            if (objB == d9nVar) {
                return objB;
            }
        }
        return rih1Var;
    }

    public Object w(String str, gxo1 gxo1Var, String str2, t4u0 t4u0Var, onm onmVar) {
        coz cozVarR = EsLoggingParams.LoggingParams.r();
        cozVarR.n(str2);
        y6r0 y6r0Var = ((b7r0) this.d).get();
        String str3 = y6r0Var != null ? y6r0Var.a : null;
        if (str3 == null) {
            str3 = "";
        }
        cozVarR.q(str3);
        qpz qpzVarP = EsOptional.OptionalInt64.p();
        qpzVarP.n(((yqg) this.b).b());
        cozVarR.t(qpzVarP);
        Object objV = v(str, gxo1Var, str2, (EsLoggingParams.LoggingParams) cozVarR.build(), t4u0Var, onmVar);
        return objV == d9n.a ? objV : rih1.a;
    }

    public Object x(String str, gxo1 gxo1Var, tv80 tv80Var, yjp1 yjp1Var, t4u0 t4u0Var, onm onmVar) {
        String str2;
        String str3 = tv80Var.a.a;
        coz cozVarR = EsLoggingParams.LoggingParams.r();
        cozVarR.n(tv80Var.a.a);
        y6r0 y6r0Var = tv80Var.b;
        if (y6r0Var == null || (str2 = y6r0Var.a) == null) {
            y6r0 y6r0Var2 = ((b7r0) this.d).get();
            str2 = y6r0Var2 != null ? y6r0Var2.a : null;
            if (str2 == null) {
                str2 = "";
            }
        }
        cozVarR.q(str2);
        qpz qpzVarP = EsOptional.OptionalInt64.p();
        qpzVarP.n(((yqg) this.b).b());
        cozVarR.t(qpzVarP);
        if (yjp1Var != null) {
            bec1 bec1VarN = StreamReportingAttributionOuterClass.StreamReportingAttribution.n();
            bec1VarN.r(yjp1Var.b);
            cozVarR.u(bec1VarN);
        }
        Object objV = v(str, gxo1Var, str3, (EsLoggingParams.LoggingParams) cozVarR.build(), t4u0Var, onmVar);
        return objV == d9n.a ? objV : rih1.a;
    }

    public void y(String str) {
        this.f = str;
    }

    public void z(MediaSessionCompat.Token token) {
        ((jih0) this.e).e.c(new aih0(this, token, (byte) 0));
    }

    public ur00(ov20 ov20Var, nm4 nm4Var) {
        this.a = (byte) 0;
        this.b = ov20Var;
        this.c = nm4Var;
        bw20 bw20Var = (bw20) ov20Var;
        this.d = bw20Var.a("filter-explicit-content", false);
        this.e = bw20Var.a("lock-filter-explicit-content", false);
        this.f = bw20Var.a("restrict-settings-for-child", false);
    }

    public ur00(cir0 cir0Var, iib0 iib0Var, q8n q8nVar) {
        this.a = (byte) 16;
        this.b = q8nVar;
        bbc bbcVarA = mno1.a(1, 2, 4);
        this.c = bbcVarA;
        this.d = k4p1.B(bbcVarA);
        Uri.Builder builderPath = new Uri.Builder().scheme("spotify").authority("internal").path("bridge-tracks-curation");
        hib0 hib0Var = iib0Var.b;
        String string = builderPath.appendQueryParameter("playlist", hib0Var.a).appendQueryParameter("trackARowId", hib0Var.b).build().toString();
        this.e = new ng7(string);
        uj1 uj1Var = uj1.i;
        Uri.encode(string);
        this.f = cir0Var.h().a(uj1Var, new wj1(this, (byte) 21));
    }

    public ur00(l8s l8sVar, Scheduler scheduler, Scheduler scheduler2) {
        this.a = (byte) 6;
        this.b = l8sVar;
        this.c = scheduler;
        this.d = scheduler2;
        this.f = new rku();
    }

    public ur00(u9c0 u9c0Var, mr20 mr20Var, String str, lmf lmfVar, vcd0 vcd0Var) {
        this.a = (byte) 21;
        this.b = str;
        this.c = lmfVar;
        this.d = vcd0Var;
        this.e = gio1.b(Boolean.FALSE);
        this.f = d5p1.r(hu20.e(mr20Var, new ndd0((byte) 1, null, this)), u9c0Var, new alb1(0L, Long.MAX_VALUE), 1);
    }

    public ur00(lzn0 lzn0Var, Resources resources, kt91 kt91Var, blp blpVar) {
        this.a = (byte) 27;
        this.b = lzn0Var;
        this.c = resources;
        this.d = kt91Var;
        this.e = blpVar;
        this.f = new idd1(new tzf0(this, (byte) 9));
    }

    public ur00(xvo xvoVar, f1n0 f1n0Var) {
        this.a = (byte) 26;
        this.b = xvoVar;
        this.c = f1n0Var;
        this.d = gio1.b(Boolean.FALSE);
    }

    public ur00(Drawable.Callback callback) {
        this.a = (byte) 4;
        this.b = new rok0((byte) 3);
        this.c = new HashMap();
        this.d = new HashMap();
        this.f = ".ttf";
        if (!(callback instanceof View)) {
            nue0.c("LottieDrawable must be inside of a view for images to work.");
            this.e = null;
        } else {
            this.e = ((View) callback).getContext().getAssets();
        }
    }

    public /* synthetic */ ur00(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public ur00(s24 s24Var, kma kmaVar, g9c0 g9c0Var, fv0 fv0Var) {
        this.a = (byte) 9;
        this.b = s24Var;
        this.c = kmaVar;
        this.d = g9c0Var;
        this.e = fv0Var;
        this.f = gio1.b(new l160(Integer.MAX_VALUE, 0, 2));
    }

    public ur00(a8e0 a8e0Var, q6e0 q6e0Var, q7r0 q7r0Var, Bundle bundle, u7r0 u7r0Var, iu30 iu30Var) {
        this.a = (byte) 25;
        this.c = a8e0Var;
        this.d = q7r0Var;
        this.e = u7r0Var;
        this.f = iu30Var;
        dt90 dt90Var = new dt90(a8e0Var, q6e0Var, q7r0Var, (byte) 12);
        if (bundle != null) {
            q6e0Var.a(bundle);
        }
        this.b = new w6e0(dt90Var, new p7e0(q6e0Var, (byte) 1));
    }

    public ur00(a1r0 a1r0Var, d490 d490Var, aje0 aje0Var, e831 e831Var, q8n q8nVar) {
        this.a = (byte) 12;
        p350 p350Var = new p350(0, d490Var, d490.class, "capture", "capture()Lcom/spotify/inappuserfeedback/issuereporter/InternalIssueReportContext;", 0, (byte) 6);
        fpo fpoVar = new fpo(e831Var, aje0Var, (lnm) null, (byte) 13);
        this.b = a1r0Var;
        this.c = p350Var;
        this.d = fpoVar;
        this.e = us71.h(q8nVar);
    }

    public ur00(EditText editText, ProgressBar progressBar, ConstraintLayout constraintLayout, EncoreButton encoreButton, EncoreButton encoreButton2, EncoreTextView encoreTextView, EncoreTextView encoreTextView2) {
        this.a = (byte) 5;
        this.b = constraintLayout;
        this.c = encoreButton;
        this.d = progressBar;
        this.e = editText;
        this.f = encoreButton2;
    }

    public ur00(ScrollView scrollView, Button button, FacePileView facePileView, SpotifyIconView spotifyIconView, TextView textView, TextView textView2) {
        this.a = (byte) 8;
        this.b = button;
        this.c = facePileView;
        this.d = spotifyIconView;
        this.e = textView;
        this.f = textView2;
    }

    public ur00() {
        this.a = (byte) 7;
    }

    public ur00(jih0 jih0Var) {
        this.a = (byte) 29;
        this.f = jih0Var;
        this.e = jih0Var;
        this.b = new ArrayList();
    }
}
