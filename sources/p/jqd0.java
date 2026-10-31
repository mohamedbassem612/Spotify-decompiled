package p;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ImageView;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.MobiusLoop;
import com.spotify.musicvideos.musicvideowidget.proto.v1.NpvWidgetResponse;
import com.spotify.musicvideos.musicvideowidget.proto.v1.VideoCard;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.io.Serializable;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jqd0 implements f080, Function, hx30, xi7, lqw, qnm0 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;

    public jqd0(zuf zufVar, uu00 uu00Var, FlowableMap flowableMap, boolean z) {
        this.a = (byte) 23;
        this.b = z;
        bpb1 bpb1VarB = gio1.b("");
        this.c = bpb1VarB;
        x010 x010Var = new x010(hu20.e(bpb1VarB, new c6e0((lnm) null, uu00Var, this, (byte) 25)), zufVar.b, new irp0(3, (lnm) null, (byte) 21), (byte) 1);
        vbm[] vbmVarArr = q601.a;
        this.d = new x010(x010Var, new kge(flowableMap), new c801(3, (lnm) null, (byte) 1), (byte) 1);
    }

    public static jqd0 p(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                arrayList.add(bundle2 != null ? new gvh0((String) null, bundle2, Collections.EMPTY_LIST) : null);
            }
        }
        return new jqd0(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public static Set t(q1o1 q1o1Var, tv80 tv80Var) {
        if (q1o1Var instanceof x951) {
            return Collections.singleton(new tc51(((x951) q1o1Var).e, tv80Var, (gto1) null, 12));
        }
        if ((q1o1Var instanceof y951) || (q1o1Var instanceof z951)) {
            String strP = q1o1Var.p();
            return Collections.singleton(new bx41(strP, strP, tv80Var));
        }
        eg.o();
        return null;
    }

    public void A(ArrayList arrayList) {
        this.c = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public boolean B(jqd0 jqd0Var) {
        if (((ax51) this.c) == null || jqd0Var == null || this.b != jqd0Var.b) {
            return true;
        }
        a9a a9aVar = (a9a) this.d;
        a9a a9aVar2 = (a9a) jqd0Var.d;
        return (a9aVar.b == a9aVar2.b && a9aVar.c == a9aVar2.c) ? false : true;
    }

    public boolean C() {
        return this.b;
    }

    public long D(c8e1 c8e1Var, long j, boolean z, f341 f341Var) {
        x6e1 x6e1Var = (x6e1) this.d;
        long jV = x6e1Var.v(c8e1Var, j, z, false, f341Var, false, (vs50) null);
        if (!nbe1.b(jV, (nbe1) this.c)) {
            this.b = false;
        }
        x6e1Var.r(nbe1.d(jV) ? zr50.c : zr50.b);
        return jV;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Serializable E(n3o1 n3o1Var, z771 z771Var, String str, ela1 ela1Var, onm onmVar) throws Throwable {
        pxh1 pxh1Var;
        ouo1 ouo1Var;
        ela1 ela1Var2;
        ela1 ela1Var3;
        String m231Var;
        ela1 ela1Var4;
        if (onmVar instanceof pxh1) {
            pxh1Var = (pxh1) onmVar;
            int i = pxh1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pxh1Var.d = i - Integer.MIN_VALUE;
            } else {
                pxh1Var = new pxh1(this, onmVar);
            }
        } else {
            pxh1Var = new pxh1(this, onmVar);
        }
        Object objU = pxh1Var.b;
        int i2 = pxh1Var.d;
        if (i2 == 0) {
            hm5.M(objU);
            if (!this.b) {
                return null;
            }
            if (n3o1Var instanceof ssd) {
                ouo1Var = ((ssd) n3o1Var).c;
            } else {
                if (!(n3o1Var instanceof tsd)) {
                    if (n3o1Var instanceof rsd) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                ouo1Var = null;
            }
            try {
                nt21 nt21Var = (nt21) this.c;
                try {
                    Set set = s4b1.f;
                    s4b1 s4b1VarX = uic.x(str);
                    ela1Var2 = ela1Var;
                    try {
                        pxh1Var.a = ela1Var2;
                        pxh1Var.d = 1;
                        objU = nt21Var.u(z771Var, s4b1VarX, ouo1Var, pxh1Var);
                        d9n d9nVar = d9n.a;
                        if (objU == d9nVar) {
                            return d9nVar;
                        }
                        ela1Var3 = ela1Var2;
                    } catch (Throwable th) {
                        th = th;
                        m231Var = new m231(th);
                        ela1Var4 = ela1Var2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    ela1Var2 = ela1Var;
                }
            } catch (Throwable th3) {
                th = th3;
                ela1Var2 = ela1Var;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ela1Var3 = pxh1Var.a;
            try {
                hm5.M(objU);
            } catch (Throwable th4) {
                th = th4;
                ela1Var2 = ela1Var3;
                m231Var = new m231(th);
                ela1Var4 = ela1Var2;
            }
        }
        m231Var = (String) objU;
        ela1Var4 = ela1Var3;
        Throwable thA = e331.a(m231Var);
        if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
            throw thA;
        }
        Throwable thA2 = e331.a(m231Var);
        if (thA2 != null) {
            Logger.e(thA2, "Failed to upload share card config", new Object[0]);
            vyo1.y((g871) this.d, k771.R0, thA2, (p371) null, ela1Var4, (o571) null, (String) null, 52);
        }
        if (m231Var instanceof m231) {
            return null;
        }
        return m231Var;
    }

    public boolean F() {
        return this.b;
    }

    public byte[] G() {
        return (byte[]) this.d;
    }

    public byte[] H(byte[] bArr, int i) {
        int i2;
        z6x z6xVarSingletonList;
        byte[] byteArray = BigInteger.valueOf(i).toByteArray();
        int i3 = 12;
        byte[] bArrX0 = f46.x0(f46.Z(0, (byte[]) this.d, 12 - byteArray.length), byteArray);
        boolean z = this.b;
        byte[] bArrZ = ((ain1) this.c).z();
        int i4 = ikn1.a;
        int[] iArr = {511133343, 1277647508, 107287496, 338123662};
        if (bArrZ.length != 32) {
            bhn0.q();
            return null;
        }
        if (bArrX0.length != 12) {
            bhn0.q();
            return null;
        }
        int i5 = 16;
        int[] iArr2 = new int[16];
        int i6 = 0;
        while (true) {
            i2 = 4;
            if (i6 >= 4) {
                break;
            }
            iArr2[i6] = ikn1.a(iArr[i6], 2131181306);
            i6++;
        }
        for (int i7 = 4; i7 < 12; i7++) {
            iArr2[i7] = ikn1.d(bArrZ, (i7 - 4) * 4);
        }
        int i8 = 1;
        iArr2[12] = 1;
        int i9 = 13;
        for (int i10 = 13; i10 < 16; i10++) {
            iArr2[i10] = ikn1.d(bArrX0, (i10 - 13) * 4);
        }
        int[] iArr3 = new int[16];
        System.arraycopy(iArr2, 0, iArr3, 0, 16);
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i11 = 1;
        int i12 = 0;
        int i13 = length;
        while (i13 > 0) {
            System.arraycopy(iArr3, 0, iArr2, 0, i5);
            iArr2[i3] = i11;
            int i14 = 0;
            while (i14 < 10) {
                ikn1.c(0, i2, 8, i3, iArr2);
                ikn1.c(i8, 5, 9, i9, iArr2);
                ikn1.c(2, 6, 10, 14, iArr2);
                ikn1.c(3, 7, 11, 15, iArr2);
                ikn1.c(0, 5, 10, 15, iArr2);
                ikn1.c(1, 6, 11, 12, iArr2);
                ikn1.c(2, 7, 8, 13, iArr2);
                ikn1.c(3, 4, 9, 14, iArr2);
                i14++;
                i2 = 4;
                i9 = 13;
                i3 = 12;
                i8 = 1;
            }
            int i15 = i9;
            int i16 = i3;
            if (z) {
                iArr3[i16] = i11;
                for (int i17 = 0; i17 < 16; i17++) {
                    iArr2[i17] = iArr2[i17] + iArr3[i17];
                }
            }
            byte[] bArr3 = new byte[64];
            i5 = 16;
            for (int i18 = 0; i18 < 16; i18++) {
                int i19 = iArr2[i18];
                int i20 = i18 * 4;
                bArr3[i20] = (byte) (i19 & 255);
                bArr3[i20 + 1] = (byte) ((i19 >> 8) & 255);
                bArr3[i20 + 2] = (byte) ((i19 >> 16) & 255);
                bArr3[i20 + 3] = (byte) ((i19 >> 24) & 255);
            }
            int i21 = 0;
            for (int i22 = 64; i21 < Math.min(i22, i13); i22 = 64) {
                int i23 = i12 + i21;
                bArr2[i23] = (byte) ikn1.a(bArr3[i21], bArr[i23]);
                i21++;
            }
            i11++;
            i13 -= 64;
            i12 += 64;
            i9 = i15;
            i8 = 1;
            i3 = 12;
            i2 = 4;
        }
        int i24 = length + 12;
        byte[] bArr4 = new byte[i24];
        System.arraycopy(bArrX0, 0, bArr4, 0, 12);
        System.arraycopy(bArr2, 0, bArr4, 12, length);
        int i25 = length >= 0 ? length : 0;
        if (i25 < 0) {
            hhg1.f(gvg.e(i25, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i25 == 0) {
            z6xVarSingletonList = z6x.a;
        } else if (i25 >= i24) {
            z6xVarSingletonList = f46.L0(bArr4);
        } else if (i25 == 1) {
            z6xVarSingletonList = Collections.singletonList(Byte.valueOf(bArr4[length + 11]));
        } else {
            z6x arrayList = new ArrayList(i25);
            for (int i26 = i24 - i25; i26 < i24; i26++) {
                arrayList.add(Byte.valueOf(bArr4[i26]));
            }
            z6xVarSingletonList = arrayList;
        }
        return o7h.g1((Collection) z6xVarSingletonList);
    }

    public void a() {
        if (this.b) {
            ((x6e1) this.d).n((nbe1) this.c);
        }
    }

    public Object apply(Object obj) {
        String strO;
        String strA0;
        boolean z = true;
        switch (this.a) {
            case 1:
                PlayerState playerState = (PlayerState) obj;
                s24 s24Var = (s24) this.c;
                boolean z2 = this.b;
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                if (contextTrack == null) {
                    strO = o4p1.o(playerState);
                } else if (l4o1.U(contextTrack)) {
                    strO = (String) contextTrack.metadata().get("pointer.uri");
                    if (strO == null) {
                        strO = o4p1.o(playerState);
                    }
                } else if (!z2 || (strO = (String) contextTrack.metadata().get("save_track.uri")) == null) {
                    strO = o4p1.o(playerState);
                }
                String str = strO;
                ContextTrack contextTrack2 = (ContextTrack) playerState.track().h();
                String strContextUri = (contextTrack2 == null || !l4o1.I(contextTrack2)) ? playerState.contextUri() : "";
                if (str.length() <= 0) {
                    return CompletableEmpty.a;
                }
                g610 g610VarA = ((x610) s24Var.b).a();
                strContextUri.getClass();
                g610VarA.getClass();
                Set set = s4b1.f;
                blc0 blc0Var = uic.x(str).c;
                blc0 blc0Var2 = blc0.ed;
                String str2 = blc0Var == blc0Var2 ? "spotify:playlist:37i9dQZF1FgnTBfUlzkeKt" : strContextUri;
                if (uic.x(str).c != blc0Var2 && uic.x(str).c != blc0.M3) {
                    z = false;
                }
                return g610VarA.b.a(str2, Collections.singletonList(str), z).flatMap(new e610(g610VarA, str, str2, (byte) 0)).flatMap(new sp00(g610VarA, str, str2, strContextUri, (byte) 6)).concatMap(new o3e0(s24Var, (m210) this.d, str, (byte) 21)).ignoreElement();
            case 4:
                String str3 = (String) this.c;
                if (!((Boolean) obj).booleanValue()) {
                    return Flowable.I(Boolean.FALSE);
                }
                if (!this.b) {
                    return Flowable.I(Boolean.TRUE);
                }
                if (str3.length() == 0) {
                    return Flowable.I(Boolean.FALSE);
                }
                uym0 uym0Var = (uym0) this.d;
                return yoi1.h(d3p1.H(uym0Var.e, uym0Var.f, str3), o6x.a);
            case 5:
                NpvWidgetResponse npvWidgetResponse = (NpvWidgetResponse) obj;
                if (npvWidgetResponse.p().isEmpty()) {
                    return MaybeEmpty.a;
                }
                z9p0 z9p0VarQ = NpvWidgetResponse.q();
                h290 h290VarP = npvWidgetResponse.p();
                phi0 phi0Var = (phi0) this.d;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : h290VarP) {
                    if (!o7h.p1(((fuj1) phi0Var.d).a).contains(((VideoCard) obj2).n())) {
                        arrayList.add(obj2);
                    }
                }
                z9p0VarQ.n(arrayList);
                z9p0VarQ.q(npvWidgetResponse.o());
                z9p0VarQ.r(npvWidgetResponse.getTitle());
                return Maybe.e(new hcn0((NpvWidgetResponse) z9p0VarQ.build(), this.b, (String) this.c, npvWidgetResponse.getTitle()));
            case 8:
                qx41 qx41Var = (qx41) this.c;
                return new y051(qx41Var.b, qx41Var.c, new r851(qx41Var.d, ((pc20) this.d).a, i651.a, this.b, qx41Var.j));
            case 9:
                icf1 icf1Var = (icf1) this.c;
                return new y051(icf1Var.a, icf1Var.c, new r851((xo20) null, (String) this.d, j651.a, this.b, (List) null));
            case 18:
                pf81 pf81Var = (pf81) this.c;
                io91 io91Var = pf81Var.b;
                String str4 = (String) this.d;
                boolean z3 = this.b;
                return new CompletableFromAction(new ho91(io91Var, (String) obj, str4, z3)).c(new CompletableFromAction(new m530((byte) 1, pf81Var, str4, z3)));
            default:
                if (!((Boolean) obj).booleanValue()) {
                    return MaybeEmpty.a;
                }
                e821 e821Var = (e821) this.c;
                ContextTrack contextTrack3 = (ContextTrack) this.d;
                boolean z4 = this.b;
                String strUri = contextTrack3.uri();
                if (strUri == null) {
                    strUri = "";
                }
                if (!l4o1.P(contextTrack3) ? (strA0 = l4o1.a0(contextTrack3, "artist_uri")) == null : (strA0 = l4o1.a0(contextTrack3, "album_uri")) == null) {
                    strA0 = "";
                }
                String strA1 = l4o1.a0(contextTrack3, "context_uri");
                return ((h9l1) e821Var.b).a(strUri, strA0, strA1 != null ? strA1 : "", z4).map(l9x0.Y0).flatMapMaybe(m9x0.Y0);
        }
    }

    public boolean b(long j) {
        r1c0 r1c0Var;
        x6e1 x6e1Var = (x6e1) this.d;
        if (!x6e1Var.i() || x6e1Var.l().a.b.length() == 0 || (r1c0Var = x6e1Var.d) == null || r1c0Var.d() == null) {
            return false;
        }
        D(x6e1Var.l(), j, false, w1x0.X);
        return true;
    }

    public boolean c(long j, f341 f341Var, int i) {
        r1c0 r1c0Var;
        x6e1 x6e1Var = (x6e1) this.d;
        if (!x6e1Var.i() || x6e1Var.l().a.b.length() == 0 || (r1c0Var = x6e1Var.d) == null || r1c0Var.d() == null) {
            return false;
        }
        lz20 lz20Var = x6e1Var.k;
        if (lz20Var != null) {
            lz20.b(lz20Var);
        }
        x6e1Var.n = j;
        x6e1Var.s = -1;
        x6e1Var.e(true);
        long jD = D(x6e1Var.l(), x6e1Var.n, true, f341Var);
        if (i >= 2) {
            this.b = true;
            this.c = new nbe1(jD);
        }
        return true;
    }

    public void d(Object obj) {
        ((h141) this.c).e(obj);
    }

    public void dispose() {
        this.b = true;
    }

    public void e(int i, Bitmap bitmap) {
        bcg bcgVar;
        kqd0 kqd0Var = (kqd0) this.c;
        ixg ixgVar = kqd0Var.P0;
        ixg ixgVar2 = (ixg) this.d;
        if (ixgVar == ixgVar2) {
            boolean z = this.b;
            ImageView imageView = kqd0Var.Y;
            if (z) {
                int i2 = bcg.g;
                bcgVar = new bcg(bitmap);
            } else {
                int i3 = bcg.g;
                bcgVar = new bcg(bitmap, kqd0Var.g.getResources().getDimensionPixelSize(2131166040));
            }
            imageView.setImageDrawable(new b490(bcgVar, imageView.getDrawable(), i));
            new tfp0(bitmap).b(new v6a0(kqd0Var, ixgVar2, (byte) 24));
        }
    }

    public boolean f(long j, f341 f341Var) {
        r1c0 r1c0Var;
        x6e1 x6e1Var = (x6e1) this.d;
        if (!x6e1Var.i() || x6e1Var.l().a.b.length() == 0 || (r1c0Var = x6e1Var.d) == null || r1c0Var.d() == null) {
            return false;
        }
        D(x6e1Var.l(), j, false, f341Var);
        return true;
    }

    public void g(Drawable drawable) {
        kqd0 kqd0Var = (kqd0) this.c;
        if (kqd0Var.P0 == ((ixg) this.d)) {
            kqd0Var.Y.setImageDrawable(drawable);
        }
    }

    public boolean h(long j) {
        x6e1 x6e1Var = (x6e1) this.d;
        r1c0 r1c0Var = x6e1Var.d;
        if (r1c0Var == null || r1c0Var.d() == null || !x6e1Var.i()) {
            return false;
        }
        x6e1Var.s = -1;
        lz20 lz20Var = x6e1Var.k;
        if (lz20Var != null) {
            lz20.b(lz20Var);
        }
        D(x6e1Var.l(), j, false, w1x0.X);
        return true;
    }

    public Bundle i() {
        List list = (List) this.d;
        Bundle bundle = (Bundle) this.c;
        if (bundle != null) {
            return bundle;
        }
        this.c = new Bundle();
        if (!list.isEmpty()) {
            int size = list.size();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(((gvh0) list.get(i)).a);
            }
            ((Bundle) this.c).putParcelableArrayList("routes", arrayList);
        }
        ((Bundle) this.c).putBoolean("supportsDynamicGroupRoute", this.b);
        return (Bundle) this.c;
    }

    public as31 j() {
        return new as31(this);
    }

    public void k(Object obj, tqw tqwVar) {
        if (this.b) {
            return;
        }
        ((rey0) this.d).a.invoke(((h141) this.c).getState(), obj, tqwVar);
    }

    public Single l(Intent intent, th61 th61Var) {
        b72 b72Var = (b72) this.c;
        return ((kiu0) b72Var.b).a(true).firstOrError().map(new hr8(this.b, b72Var, (vu30) this.d, intent, th61Var)).onErrorReturn(new iux0(intent, (byte) 0));
    }

    public void m(Drawable drawable) {
        kqd0 kqd0Var = (kqd0) this.c;
        if (kqd0Var.P0 == ((ixg) this.d)) {
            kqd0Var.P0 = null;
            kqd0Var.Y.setImageDrawable(drawable);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object n(long j, String str, onm onmVar) {
        c5s0 c5s0Var;
        String str2;
        Object obj;
        long j2;
        if (onmVar instanceof c5s0) {
            c5s0Var = (c5s0) onmVar;
            int i = c5s0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5s0Var.e = i - Integer.MIN_VALUE;
            } else {
                c5s0Var = new c5s0(this, onmVar);
            }
        } else {
            c5s0Var = new c5s0(this, onmVar);
        }
        c5s0 c5s0Var2 = c5s0Var;
        Object obj2 = c5s0Var2.c;
        int i2 = c5s0Var2.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj2);
            Set set = s4b1.f;
            if (uic.x(str).c == blc0.Pg) {
                swm0 swm0Var = (swm0) this.c;
                c5s0Var2.a = str;
                c5s0Var2.b = j;
                c5s0Var2.e = 1;
                Object objS = swm0Var.s(str, c5s0Var2);
                if (objS != d9nVar) {
                    str2 = str;
                    obj = objS;
                    j2 = j;
                }
            }
            return null;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj2);
                return obj2;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j3 = c5s0Var2.b;
        String str3 = c5s0Var2.a;
        hm5.M(obj2);
        str2 = str3;
        obj = obj2;
        j2 = j3;
        if (((Boolean) obj).booleanValue() && 0 <= j2 && j2 < 2147484) {
            wc80 wc80Var = new wc80(this, str2, j2 * 1000, (lnm) null, (byte) 4);
            c5s0Var2.a = null;
            c5s0Var2.b = j2;
            c5s0Var2.e = 2;
            Object objO = rc2.O(1000L, wc80Var, c5s0Var2);
            return objO == d9nVar ? d9nVar : objO;
        }
        return null;
    }

    public Single o(int i, pks0 pks0Var) {
        return ((of60) this.d).a().take(1L).singleOrError().flatMap(new dna1(i, this, pks0Var)).onErrorReturn(hcx0.V0);
    }

    public void onFailure(Throwable th) {
        oon1.w("Failed calling onPlayRequested", th);
    }

    public void onSuccess(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            fzh0 fzh0Var = (fzh0) this.d;
            ixh0 ixh0Var = (ixh0) this.c;
            boolean z = this.b;
            boolean z2 = fzh0Var.t.Y(16) && fzh0Var.t.u() != null;
            boolean z3 = fzh0Var.t.Y(31) || fzh0Var.t.Y(20);
            ixh0 ixh0VarA = fzh0Var.A(ixh0Var);
            l8u0 l8u0Var = new l8u0();
            l8u0Var.a.c(1);
            m8u0 m8u0VarD = l8u0Var.d();
            if (!z2 && z3) {
                fzh0Var.e.getClass();
                c280 c280Var = new c280(new UnsupportedOperationException());
                c280Var.b(new nx30(c280Var, new rl1(fzh0Var, ixh0VarA, z, m8u0VarD), (byte) 24), new wkh0(fzh0Var, (byte) 3));
                return;
            }
            if (!z2) {
                oon1.H("Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            zoi1.M(fzh0Var.t);
            if (z) {
                fzh0Var.v(ixh0VarA, m8u0VarD);
            }
        }
    }

    public int q() {
        a9a a9aVar = (a9a) this.d;
        int i = a9aVar.b;
        int i2 = a9aVar.c;
        if (i < i2) {
            return 2;
        }
        return i > i2 ? 1 : 3;
    }

    public String r() {
        return (String) this.c;
    }

    public String s() {
        return (String) this.d;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 2:
                return "MediaRouteProviderDescriptor{ routes=" + Arrays.toString(((List) this.d).toArray()) + ", isValid=" + x() + " }";
            case 19:
                boolean z = this.b;
                int iQ = q();
                a9a a9aVar = (a9a) this.d;
                StringBuilder sb = new StringBuilder("SingleSelectionLayout(isStartHandle=");
                sb.append(z);
                sb.append(", crossed=");
                if (iQ == 1) {
                    str = "CROSSED";
                } else if (iQ != 2) {
                    str = iQ != 3 ? "null" : "COLLAPSED";
                } else {
                    str = "NOT_CROSSED";
                }
                sb.append(str);
                sb.append(", info=\n\t");
                sb.append(a9aVar);
                sb.append(")");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0060  */
    public xj61 u(q1o1 q1o1Var, z551 z551Var, tv80 tv80Var, long j) {
        boolean zContains;
        boolean z;
        di4 di4Var = (di4) this.d;
        xj61 xj61Var = new xj61();
        if (q1o1Var instanceof x951) {
            x951 x951Var = (x951) q1o1Var;
            xj61Var.add(new sx41(x951Var.e, tv80Var, j, "", x951Var.j, 32));
            if (x951Var.j && !di4Var.H()) {
                xj61Var.add(new vc51(tv80Var));
            }
        } else if (q1o1Var instanceof y951) {
            String str = ((y951) q1o1Var).e;
            xj61Var.add(new sx41(str, tv80Var, j, str, false, 48));
        } else {
            vc51 vc51Var = null;
            if (!(q1o1Var instanceof z951)) {
                eg.o();
                return null;
            }
            z951 z951Var = (z951) q1o1Var;
            String str2 = z951Var.e;
            if (sgy.i(str2)) {
                re20 re20Var = z551Var.h;
                boolean z2 = re20Var instanceof re20;
                List list = z6x.a;
                if (z2) {
                    zContains = d0p1.Y(list, re20Var.a);
                } else if (re20Var instanceof te20) {
                    a951 a951Var = z551Var.d;
                    a951 a951Var2 = a951Var instanceof a951 ? a951Var : null;
                    siq0 siq0Var = a951Var2 != null ? a951Var2.a : null;
                    qiq0 qiq0Var = siq0Var instanceof qiq0 ? (qiq0) siq0Var : null;
                    List list2 = qiq0Var != null ? qiq0Var.c : null;
                    if (list2 != null) {
                        list = list2;
                    }
                    zContains = list.contains("media:video");
                } else {
                    if (!u890.j(re20Var, se20.a)) {
                        eg.o();
                        return null;
                    }
                    zContains = false;
                }
                if (z951Var.r && z951Var.q != null && (zContains || z951Var.m)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            String str3 = z951Var.o;
            String str4 = str3 == null ? str2 : str3;
            String str5 = z951Var.e;
            boolean z3 = z951Var.i;
            xyn1 sx41Var = new sx41(str5, tv80Var, j, str4, z, z3);
            if (z && !z3 && !di4Var.H()) {
                vc51Var = new vc51(tv80Var);
            }
            xj61Var.addAll(f46.i0(new xyn1[]{sx41Var, vc51Var}));
        }
        xj61Var.add(sc51.b);
        return cwl1.j(xj61Var);
    }

    public List v() {
        return (List) this.d;
    }

    public boolean w() {
        return this.b;
    }

    public boolean x() {
        List list = (List) this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            gvh0 gvh0Var = (gvh0) list.get(i);
            if (gvh0Var == null || !gvh0Var.n()) {
                return false;
            }
        }
        return true;
    }

    public void y(int i) {
        String str;
        t45 t45Var = (t45) this.d;
        if (t45Var != null) {
            if (i == 1) {
                str = "success";
            } else {
                if (i != 2) {
                    throw null;
                }
                str = "latest_rows_data_failed";
            }
            t45Var.g.put(VoiceAssistantsPerformance.DIMENSION_OUTCOME, str);
            t45Var.g("load_sidedrawer_campfire_rows");
            ((zle1) this.c).b(t45Var.e());
        }
        this.d = null;
        this.b = false;
    }

    public Set z(q1o1 q1o1Var, z551 z551Var, tv80 tv80Var, boolean z, Function0 function0) {
        int iJ = q1o1Var.j();
        m131 m131Var = z551Var.X;
        fw41 fw41Var = z551Var.f;
        boolean z2 = false;
        boolean z3 = m131Var.b && iJ == 1;
        boolean z4 = sgy.i(q1o1Var.p()) && !fw41Var.a && this.b;
        boolean z5 = sgy.i(q1o1Var.p()) && fw41Var.a;
        boolean zI = sgy.i(q1o1Var.p());
        if (z3 && (z4 || z5 || !zI)) {
            z2 = true;
        }
        boolean z6 = q1o1Var instanceof z951;
        if (z6) {
            z951 z951Var = (z951) q1o1Var;
            if (z951Var.j && z) {
                return Collections.singleton(new dd51(z951Var.e, z951Var.p, tv80Var, z951Var.n));
            }
        }
        if (z2) {
            return Collections.singleton(new yc51(q1o1Var.p()));
        }
        if (q1o1Var.q()) {
            return Collections.singleton(new zc51(q1o1Var.p(), tv80Var));
        }
        int iJ2 = q1o1Var.j();
        if (z551Var.X.a && iJ2 == 2) {
            return Collections.singleton(new cd51(q1o1Var.p()));
        }
        if ((!z6 && !(q1o1Var instanceof x951)) || !q1o1Var.o()) {
            return (Set) function0.invoke();
        }
        Integer numI = q1o1Var.i();
        return numI != null ? Collections.singleton(new xc51(numI.intValue(), tv80Var)) : (Set) function0.invoke();
    }

    public /* synthetic */ jqd0(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    public /* synthetic */ jqd0(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public /* synthetic */ jqd0(boolean z, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }

    public jqd0(ain1 ain1Var, boolean z) {
        this.a = (byte) 29;
        this.c = ain1Var;
        this.b = z;
        int i = ikn1.a;
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        this.d = bArr;
    }

    public jqd0(ynb0 ynb0Var) {
        this.a = (byte) 6;
        this.c = ynb0Var;
        this.d = new txk0((byte) 4);
    }

    public jqd0(h141 h141Var, Object obj, rey0 rey0Var) {
        this.a = (byte) 15;
        this.c = h141Var;
        this.d = rey0Var;
        h141Var.e(obj);
    }

    public jqd0(zle1 zle1Var) {
        this.a = (byte) 10;
        this.c = zle1Var;
    }

    public jqd0(boolean z, dma1 dma1Var) {
        this.a = (byte) 24;
        this.b = z;
        this.c = dma1Var;
        this.d = gio1.b(Boolean.valueOf(dma1Var.h(e6g1.a, true)));
    }

    public /* synthetic */ jqd0(ObservableTransformer observableTransformer, Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public jqd0(ArrayList arrayList, boolean z) {
        this.a = (byte) 2;
        if (arrayList.isEmpty()) {
            this.d = Collections.EMPTY_LIST;
        } else {
            this.d = Collections.unmodifiableList(new ArrayList(arrayList));
        }
        this.b = z;
    }

    public jqd0(Executor executor) {
        this.a = (byte) 13;
        g4r g4rVar = tvt.a;
        if (tvt.a.m(LowMemoryQuirk.class) != null) {
            this.c = new g661(executor);
        } else {
            this.c = executor;
        }
        this.d = g4rVar;
        this.b = g4rVar.l(IncorrectJpegMetadataQuirk.class);
    }

    public jqd0() {
        this.a = (byte) 16;
        this.c = Collections.EMPTY_LIST;
        this.b = true;
    }

    public jqd0(MobiusLoop mobiusLoop, pdw0 pdw0Var) {
        this.a = (byte) 12;
        this.c = mobiusLoop;
        this.d = pdw0Var;
    }

    public jqd0(x6e1 x6e1Var) {
        this.a = (byte) 22;
        this.d = x6e1Var;
        this.b = true;
    }

    public jqd0(fzh0 fzh0Var, ixh0 ixh0Var, boolean z) {
        this.a = (byte) 3;
        this.d = fzh0Var;
        this.c = ixh0Var;
        this.b = z;
    }
}
