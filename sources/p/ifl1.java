package p;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionBarContextView;
import com.spotify.audio.record.AudioRecordingException;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.trending.v1.TrendingLocationSignalPayload;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.FlowableOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableZip;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ifl1 implements k1q0, SingleOnSubscribe, FlowableOnSubscribe, Function, hv30, lku, is31 {
    public static final eig0 c = new eig0();
    public static final lzm1 d = new lzm1();
    public final /* synthetic */ byte a;
    public Object b;

    public ifl1(byte b) {
        lzi0 lzi0Var;
        this.a = b;
        switch (b) {
            case 2:
                int i = asn1.a;
                this.b = new lxh1(new e4o1[]{zov0.X, d}, (byte) 15);
                break;
            case 12:
                this.b = new HashSet();
                break;
            case 19:
                break;
            default:
                try {
                    lzi0Var = (lzi0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    lzi0Var = c;
                }
                lzi0[] lzi0VarArr = {se40.a, lzi0Var};
                iig0 iig0Var = new iig0();
                iig0Var.a = lzi0VarArr;
                Charset charset = k290.a;
                this.b = iig0Var;
                break;
        }
    }

    public static int n() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & 127) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i;
    }

    @Override // p.lku
    public l2t a() {
        return (s2t) this.b;
    }

    @Override // p.hv30
    public Object apply(Object obj) {
        switch (this.a) {
            case 11:
                FlowableZip flowableZipC0 = ((Flowable) obj).c0(Flowable.O(1, Integer.MAX_VALUE), uh21.U0);
                kba kbaVar = new kba((rhn) this.b, (byte) 26);
                int i = Flowable.a;
                return flowableZipC0.A(kbaVar, i, i);
            case 16:
                return (sh0) this.b;
            default:
                h290<EsOffline.Device> h290VarN = ((EsOffline.GetDevicesResponse) obj).n();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
                for (EsOffline.Device device : h290VarN) {
                    device.getClass();
                    arrayList.add(cqg0.a(device));
                }
                List listQ0 = f46.Q0((bpt[]) this.b);
                if (listQ0.isEmpty()) {
                    return arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (listQ0.contains(((ept) obj2).g())) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
        }
    }

    public j380 b() {
        Map map = (Map) this.b;
        if (map instanceof j380) {
            return j380.c(map);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return j380.c(linkedHashMap);
    }

    public jhm c(String str, String str2, String str3) {
        idd1 idd1Var = new idd1(new hh(str, str2, str3, (byte) 3));
        return new jhm("add_note", gox.c, (fhm) null, 2131954317, (String) null, false, (tm81) null, new ihm(new ygm(), new ghm(gx0.a1, new we1(idd1Var, (byte) 0)), new d4(this, idd1Var, (byte) 16)), 244);
    }

    public void d(u570 u570Var) {
        ((v570) this.b).a(u570Var);
    }

    @Override // p.lku
    public void dispose() {
        s2t s2tVar = (s2t) this.b;
        if (s2tVar.isActive()) {
            ha71.o(s2tVar);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(String str, TrendingLocationSignalPayload trendingLocationSignalPayload, onm onmVar) throws NoWhenBranchMatchedException {
        tne0 tne0Var;
        if (onmVar instanceof tne0) {
            tne0Var = (tne0) onmVar;
            int i = tne0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tne0Var.c = i - Integer.MIN_VALUE;
            } else {
                tne0Var = new tne0(this, onmVar);
            }
        } else {
            tne0Var = new tne0(this, onmVar);
        }
        Object objS = tne0Var.a;
        int i2 = tne0Var.c;
        if (i2 == 0) {
            hm5.M(objS);
            byte[] byteArray = trendingLocationSignalPayload.toByteArray();
            hhc hhcVar = phc.b;
            ayc0 ayc0Var = new ayc0("tny-location-update", (phc) null, phc.e(0, byteArray, byteArray.length), true, (String) null, 18);
            xyc0 xyc0Var = (iyc0) this.b;
            List listX = k4p1.x(ayc0Var);
            tne0Var.c = 1;
            objS = xyc0Var.s(str, listX, z6x.a, tne0Var);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objS);
        }
        ly21 ly21Var = (py21) objS;
        if (ly21Var instanceof oy21) {
            return rih1.a;
        }
        if (ly21Var instanceof ly21) {
            return new m231(new RuntimeException(ly21Var.a.toString()));
        }
        eg.o();
        return null;
    }

    public Intent f(Intent intent) {
        x8v0 x8v0Var = (x8v0) this.b;
        Uri data = intent.getData();
        Uri uriBuild = !u890.j(data != null ? data.getAuthority() : null, "open.spotify.com") ? null : data.buildUpon().authority("www.spotify.com").build();
        if (uriBuild == null) {
            return null;
        }
        return ((swv0) x8v0Var.c).a((Context) x8v0Var.b, new rwv0(sxf.b, uriBuild), null);
    }

    public Single g() {
        return ((dxz0) this.b).e().first(Boolean.FALSE).map(new q58((byte) 18));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public csi0 h(zy70 zy70Var, bsi0 bsi0Var, k291 k291Var, dg41 dg41Var) throws NoWhenBranchMatchedException {
        csi0 csi0Var;
        int iAbs;
        csi0 csi0Var2;
        jsc jscVar = zy70Var.j;
        int i = zy70Var.r;
        if (jscVar.a) {
            wf01 wf01VarD = ((rf01) this.b).d();
            if (wf01VarD != null) {
                synchronized (wf01VarD.c) {
                    try {
                        bg01 bg01Var = (bg01) ((cg01) wf01VarD.a.c).a.get(bsi0Var);
                        csi0Var = bg01Var != null ? new csi0(bg01Var.a, bg01Var.b) : null;
                        if (csi0Var == null) {
                            up20 up20Var = wf01VarD.b;
                            ArrayList arrayList = (ArrayList) ((LinkedHashMap) up20Var.b).get(bsi0Var);
                            if (arrayList == null) {
                                csi0Var = null;
                            } else {
                                int size = arrayList.size();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= size) {
                                        csi0Var2 = null;
                                        break;
                                    }
                                    eg01 eg01Var = (eg01) arrayList.get(i2);
                                    oq70 oq70Var = (oq70) eg01Var.b().get();
                                    csi0Var2 = oq70Var != null ? new csi0(oq70Var, eg01Var.a()) : null;
                                    if (csi0Var2 != null) {
                                        break;
                                    }
                                    i2++;
                                }
                                up20Var.b();
                                csi0Var = csi0Var2;
                            }
                        }
                        if (csi0Var != null && !csi0Var.a.d()) {
                            wf01VarD.b(bsi0Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                csi0Var = null;
            }
            if (csi0Var != null && km3.F(zy70Var, csi0Var)) {
                String str = (String) bsi0Var.b.get("coil#size");
                if (str == null) {
                    Object obj = csi0Var.b.get("coil#is_sampled");
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    oq70 oq70Var2 = csi0Var.a;
                    if (zBooleanValue || (!u890.j(k291Var, k291.c) && i != 2)) {
                        int width = oq70Var2.getWidth();
                        int height = oq70Var2.getHeight();
                        k291 k291Var2 = oq70Var2 instanceof kxa ? (k291) kto1.u(zy70Var, cz70.b) : k291.c;
                        c5u c5uVar = k291Var.a;
                        int i3 = c5uVar instanceof w4u ? ((w4u) c5uVar).a : Integer.MAX_VALUE;
                        c5u c5uVar2 = k291Var2.a;
                        int iMin = Math.min(i3, c5uVar2 instanceof w4u ? ((w4u) c5uVar2).a : Integer.MAX_VALUE);
                        c5u c5uVar3 = k291Var.b;
                        int i4 = c5uVar3 instanceof w4u ? ((w4u) c5uVar3).a : Integer.MAX_VALUE;
                        c5u c5uVar4 = k291Var2.b;
                        int iMin2 = Math.min(i4, c5uVar4 instanceof w4u ? ((w4u) c5uVar4).a : Integer.MAX_VALUE);
                        double d2 = ((double) iMin) / ((double) width);
                        double d3 = ((double) iMin2) / ((double) height);
                        int iOrdinal = ((iMin == Integer.MAX_VALUE || iMin2 == Integer.MAX_VALUE) ? dg41.b : dg41Var).ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                eg.o();
                                return null;
                            }
                            if (d2 < d3) {
                                iAbs = Math.abs(iMin - width);
                            } else {
                                iAbs = Math.abs(iMin2 - height);
                                d2 = d3;
                            }
                        } else if (d2 > d3) {
                            iAbs = Math.abs(iMin - width);
                        } else {
                            iAbs = Math.abs(iMin2 - height);
                            d2 = d3;
                        }
                        if (iAbs > 1) {
                            int iC = l1d.C(i);
                            if (iC != 0) {
                                if (iC != 1) {
                                    eg.o();
                                    return null;
                                }
                                if (d2 <= 1.0d) {
                                }
                            } else if (d2 == 1.0d) {
                            }
                        }
                    }
                    return csi0Var;
                }
                if (str.equals(k291Var.toString())) {
                    return csi0Var;
                }
            }
        }
        return null;
    }

    public synchronized eea0 i() {
        return eea0.a((eva0) ((bva0) this.b).a());
    }

    public synchronized boolean j(int i) {
        Iterator it = Collections.unmodifiableList(((eva0) ((bva0) this.b).b).p()).iterator();
        while (it.hasNext()) {
            if (((dva0) it.next()).n() == i) {
                return true;
            }
        }
        return false;
    }

    public bsi0 k(zy70 zy70Var, Object obj, dqq0 dqq0Var, va00 va00Var) {
        String strA;
        jsc jscVar = zy70Var.j;
        Map map = zy70Var.e;
        if (jscVar != jsc.DISABLED) {
            List list = ((rf01) this.b).d.c;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    strA = null;
                    break;
                }
                mmr0 mmr0Var = (mmr0) list.get(i);
                rua0 rua0Var = (rua0) mmr0Var.a;
                if (((tka0) mmr0Var.b).m(obj) && (strA = rua0Var.a(obj, dqq0Var)) != null) {
                    break;
                }
                i++;
            }
            if (strA != null) {
                if (((List) kto1.u(zy70Var, cz70.a)).isEmpty()) {
                    return new bsi0(strA, map);
                }
                LinkedHashMap linkedHashMapX = sqg0.X(map);
                linkedHashMapX.put("coil#size", dqq0Var.b.toString());
                return new bsi0(strA, linkedHashMapX);
            }
        }
        return null;
    }

    public synchronized dva0 l(tpa0 tpa0Var) {
        bpa0 bpa0VarE;
        int iN;
        try {
            bpa0VarE = vf11.e(tpa0Var);
            synchronized (this) {
                iN = n();
                while (j(iN)) {
                    iN = n();
                }
            }
            return (dva0) cva0VarR.a();
        } catch (Throwable th) {
            throw th;
        }
        fuq0 fuq0VarN = tpa0Var.n();
        if (fuq0VarN == fuq0.UNKNOWN_PREFIX) {
            fuq0VarN = fuq0.TINK;
        }
        cva0 cva0VarR = dva0.r();
        cva0VarR.d();
        ((dva0) cva0VarR.b).s(bpa0VarE);
        cva0VarR.d();
        ((dva0) cva0VarR.b).t(iN);
        cva0VarR.d();
        ((dva0) cva0VarR.b).v();
        cva0VarR.d();
        ((dva0) cva0VarR.b).u(fuq0VarN);
        return (dva0) cva0VarR.a();
    }

    public void m() {
        y861 y861Var = ((n3c) this.b).f;
        y861Var.r(t861.b);
        y861Var.p("onAdsParamsFetchFinished");
    }

    public void subscribe(FlowableEmitter flowableEmitter) {
        w28 w28Var = (w28) this.b;
        t28 t28VarA = w28Var.a();
        t28VarA.a();
        try {
            t28VarA.p();
            int iB = w28Var.b();
            while (!flowableEmitter.isCancelled() && t28VarA.k() == 3) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iB).order(ByteOrder.nativeOrder());
                byteBufferOrder.getClass();
                int iF = t28VarA.f(byteBufferOrder, iB);
                if (iF < 0 && !flowableEmitter.isCancelled()) {
                    flowableEmitter.onError(new AudioRecordingException(new Exception(f4i1.c(iF, "Recording failed; code: "))));
                    break;
                } else if (iF > 0 && !flowableEmitter.isCancelled()) {
                    byteBufferOrder.position(0);
                    byteBufferOrder.limit(iF);
                    flowableEmitter.onNext(byteBufferOrder);
                }
            }
            if (flowableEmitter.isCancelled()) {
                return;
            }
            flowableEmitter.onComplete();
        } catch (IllegalStateException e) {
            throw new AudioRecordingException(e);
        }
    }

    @Override // p.k1q0
    public hsl1 x(View view, hsl1 hsl1Var) {
        int iD = hsl1Var.d();
        yj5 yj5Var = (yj5) this.b;
        int iD2 = hsl1Var.d();
        ActionBarContextView actionBarContextView = yj5Var.U0;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) yj5Var.U0.getLayoutParams();
            boolean z = false;
            if (yj5Var.U0.isShown()) {
                if (yj5Var.A1 == null) {
                    yj5Var.A1 = new Rect();
                    yj5Var.B1 = new Rect();
                }
                Rect rect = yj5Var.A1;
                Rect rect2 = yj5Var.B1;
                rect.set(hsl1Var.b(), hsl1Var.d(), hsl1Var.c(), hsl1Var.a());
                nk80 nk80VarI = hsl1Var.a.i(2);
                ViewGroup viewGroup = yj5Var.Z0;
                boolean z2 = true;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z3 = sik1.a;
                    g961.a(rect, rect2, viewGroup);
                } else {
                    if (!sik1.a) {
                        sik1.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            sik1.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                sik1.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    Method method = sik1.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                nk80 nk80VarC = nk80.c(Math.max(0, nk80VarI.a - rect2.left), Math.max(0, nk80VarI.b - rect2.top), Math.max(0, nk80VarI.c - rect2.right), Math.max(0, nk80VarI.d - rect2.bottom));
                int i = nk80VarC.c;
                int i2 = marginLayoutParams.leftMargin;
                int i3 = nk80VarC.a;
                if (i2 == i3 && marginLayoutParams.rightMargin == i) {
                    z2 = false;
                } else {
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i;
                }
                yj5Var.U0.i(rect.left - i3, rect.top, rect.right - i);
                if (!yj5Var.f1 && rect.top > 0) {
                    iD2 = 0;
                }
                z = z2;
            }
            if (z) {
                yj5Var.U0.setLayoutParams(marginLayoutParams);
            }
        }
        if (iD != iD2) {
            int iB = hsl1Var.b();
            int iC = hsl1Var.c();
            int iA = hsl1Var.a();
            dmj1 dmj1Var = new dmj1(hsl1Var);
            dmj1Var.f(nk80.c(iB, iD2, iC, iA));
            hsl1Var = dmj1Var.b();
        }
        return b8k1.i(view, hsl1Var);
    }

    public ifl1(v570 v570Var) {
        this.a = (byte) 17;
        v570Var.getClass();
        this.b = v570Var;
    }

    public ifl1(rf01 rf01Var, km3 km3Var) {
        this.a = (byte) 24;
        this.b = rf01Var;
    }

    public /* synthetic */ ifl1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public void subscribe(SingleEmitter singleEmitter) {
        m26 m26Var = (m26) this.b;
        luk lukVar = m26Var.r;
        if (lukVar == null || !lukVar.i("apps-music-libs-eventsender.background_worker_send")) {
            lukVar = m26Var.s;
        }
        if (lukVar != null) {
            lukVar.e(new k26(singleEmitter, m26Var, (byte) 0));
        }
    }
}
