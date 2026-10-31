package p;

import android.graphics.Path;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.car.app.navigation.model.Maneuver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.checkout.proto.model.v1.proto.GetSessionStatusRequest;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.MessageParsingException;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.data.network.MessageNotReturnedException;
import com.spotify.pendragon.v1.proto.FetchMessageListResponse;
import com.spotify.pendragon.v1.proto.InAppMessage;
import com.spotify.share.chatpreviews.core.impl.proto.Color;
import com.spotify.share.chatpreviews.core.impl.proto.Image;
import com.spotify.share.chatpreviews.core.impl.proto.ImageBytes;
import com.spotify.share.chatpreviews.core.impl.proto.ShareFormat;
import com.spotify.share.chatpreviews.core.impl.proto.UploadBackground;
import com.spotify.share.chatpreviews.core.impl.proto.UploadChatPreviewRequest;
import com.spotify.share.chatpreviews.core.impl.proto.UploadImage;
import com.spotify.share.chatpreviews.core.impl.proto.Video;
import io.reactivex.rxjava3.core.CompletableEmitter;
import io.reactivex.rxjava3.core.CompletableOnSubscribe;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDefer;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zwa implements Function, cst0, CompletableOnSubscribe, k1q0, qiw, n4n1, ya {
    public final /* synthetic */ byte a;
    public final Object b;

    public zwa(byte b) {
        Object objE;
        this.a = b;
        switch (b) {
            case 16:
                this.b = new ArrayList();
                return;
            default:
                xdn0 xdn0VarD = xdn0.d();
                this.b = xdn0VarD;
                Object objE2 = null;
                try {
                    objE = xdn0VarD.e(jrd1.s0);
                    break;
                } catch (IllegalArgumentException unused) {
                    objE = null;
                }
                Class cls = (Class) objE;
                if (cls != null && !cls.equals(d5d.class)) {
                    hhg1.i("Invalid target class configuration for ", this, ": ", cls);
                    throw null;
                }
                xdn0 xdn0Var = (xdn0) this.b;
                xdn0Var.r(jrd1.s0, d5d.class);
                try {
                    objE2 = xdn0Var.e(jrd1.r0);
                    break;
                } catch (IllegalArgumentException unused2) {
                }
                if (objE2 == null) {
                    xdn0Var.r(jrd1.r0, d5d.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }

    public boolean accept(Object obj) {
        ksk kskVar = (ksk) obj;
        if (!((w7r) this.b).h()) {
            return false;
        }
        le30 le30Var = kskVar.c;
        return le30Var == le30.Y || le30Var == le30.Z;
    }

    public Object apply(Object obj) throws MessageNotReturnedException {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 4:
                mmr0 mmr0Var = (mmr0) obj;
                zlc zlcVar = (zlc) mmr0Var.a;
                String str = (String) mmr0Var.b;
                ulc ulcVar = ((xlc) obj2).a;
                String strP = ulc.p();
                String str2 = zlcVar.a;
                return new gmc(strP, str2, TriggerType.PLAYBACK_STARTED, str, (tv80) null, (uy31) null, new DynamicTagsMetadata(str2, (String) null, (String) null, (String) null, 14, (DefaultConstructorMarker) null), new d3j0(new z2j0(false), x2j0.a), 368);
            case 7:
                mmr0 mmr0Var2 = (mmr0) obj;
                boolean zBooleanValue = ((Boolean) mmr0Var2.a).booleanValue();
                String str3 = (String) mmr0Var2.b;
                if (!zBooleanValue) {
                    return Flowable.I("");
                }
                xf0 xf0Var = new xf0((pnd) obj2, str3, (byte) 1);
                int i = Flowable.a;
                return new FlowableDefer(xf0Var);
            case 11:
                s6g s6gVar = (s6g) obj2;
                t6g t6gVar = s6gVar.b;
                yp40 yp40VarN = GetSessionStatusRequest.n();
                yp40VarN.n(s6gVar.c.b);
                return t6gVar.b(yp40VarN.build()).compose(new dn81((byte) 2)).map(vgp1.O0).onErrorReturn(zp8.P0);
            case 12:
                FetchMessageListResponse fetchMessageListResponse = (FetchMessageListResponse) obj;
                lag lagVar = (lag) obj2;
                if (fetchMessageListResponse.getMessagesList().isEmpty() && fetchMessageListResponse.o().isEmpty()) {
                    throw new MessageNotReturnedException();
                }
                ArrayList arrayList = new ArrayList();
                for (InAppMessage inAppMessage : fetchMessageListResponse.getMessagesList()) {
                    try {
                        ffr ffrVar = (ffr) lagVar.c;
                        inAppMessage.getClass();
                        arrayList.add(ffrVar.invoke(inAppMessage));
                    } catch (MessageParsingException e) {
                        inAppMessage.getClass();
                        lagVar.o(inAppMessage, e);
                    }
                }
                h290 h290VarO = fetchMessageListResponse.o();
                tae1 tae1Var = (tae1) lagVar.d;
                ArrayList arrayList2 = new ArrayList(q7h.U(h290VarO, 10));
                Iterator it = h290VarO.iterator();
                while (it.hasNext()) {
                    arrayList2.add(tae1Var.invoke(it.next()));
                }
                return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.network.FetchMessageListResponse(arrayList, arrayList2);
            case 14:
                t8r0 t8r0Var = ((z0h) obj2).c;
                return j2h1.D((q8n) t8r0Var.b, new xht0(t8r0Var, ((o0h) obj).a.a, (lnm) null, (byte) 0));
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                Boolean bool = ((to91) obj).a;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : ((uh80) obj2).f);
            default:
                return ((air) obj2).b.a().map(new vun((wt8) obj, (byte) 6));
        }
    }

    public float b() {
        return 1.0f;
    }

    public float e() {
        Float f = (Float) ((w2d) this.b).a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f != null && f.floatValue() >= 1.0f) {
            return f.floatValue();
        }
        return 1.0f;
    }

    public void f(vvg1 vvg1Var) {
        ((ArrayList) this.b).add(vvg1Var);
    }

    public void g(Path path) {
        ArrayList arrayList = (ArrayList) this.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            vvg1 vvg1Var = (vvg1) arrayList.get(size);
            p5r p5rVar = qpi1.a;
            if (vvg1Var != null && !vvg1Var.a) {
                qpi1.a(path, vvg1Var.d.k() / 100.0f, vvg1Var.e.k() / 100.0f, vvg1Var.f.k() / 360.0f);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(onm onmVar) {
        amn amnVar;
        if (onmVar instanceof amn) {
            amnVar = (amn) onmVar;
            int i = amnVar.c;
            if ((i & os00.INVALID_ID) != 0) {
                amnVar.c = i - os00.INVALID_ID;
            } else {
                amnVar = new amn(this, onmVar);
            }
        } else {
            amnVar = new amn(this, onmVar);
        }
        Object objL = amnVar.a;
        int i2 = amnVar.c;
        if (i2 == 0) {
            hm5.M(objL);
            Observable observableA = ((xvo) this.b).a(true);
            amnVar.c = 1;
            objL = fc11.l(observableA, 1, (Object) null, amnVar);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objL);
        }
        return objL;
    }

    public bst0 i(i1z i1zVar, lnn1 lnn1Var, h131 h131Var) {
        cce cceVar = (cce) this.b;
        cceVar.d = lnn1Var;
        int i = ((jma) cceVar.b).i(i1zVar, dsa0.o(i1zVar.k, i1zVar.l), h131Var);
        i2z i2zVar = (lnn1) cceVar.d;
        String str = i1zVar.a;
        boolean z = i2zVar instanceof i2z;
        i2z i2zVar2 = z ? i2zVar : null;
        boolean z2 = false;
        if (i2zVar2 != null) {
            String str2 = i2zVar2.c;
            if (str2.length() > 0 && str2.equals(str)) {
                i2z i2zVar3 = z ? i2zVar : null;
                if (i2zVar3 != null ? i2zVar3.g : false) {
                    z2 = true;
                }
            }
        }
        return new bst0(i, ((long) cce.s((lnn1) cceVar.d)) * 1000, cce.D((lnn1) cceVar.d, str, (lik1) cceVar.c), z2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(wgf wgfVar, String str, onm onmVar) throws IOException {
        shf shfVar;
        wgf wgfVar2;
        awh1 awh1Var;
        awh1 awh1Var2;
        wgf wgfVar3;
        if (onmVar instanceof shf) {
            shfVar = (shf) onmVar;
            int i = shfVar.g;
            if ((i & os00.INVALID_ID) != 0) {
                shfVar.g = i - os00.INVALID_ID;
            } else {
                shfVar = new shf(this, onmVar);
            }
        } else {
            shfVar = new shf(this, onmVar);
        }
        Object objP = shfVar.e;
        int i2 = shfVar.g;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objP);
            awh1 awh1VarN = UploadChatPreviewRequest.n();
            xgf xgfVar = wgfVar.a;
            shfVar.a = wgfVar;
            shfVar.b = str;
            shfVar.c = awh1VarN;
            shfVar.g = 1;
            Object objO = o(xgfVar, shfVar);
            if (objO != obj) {
                wgfVar2 = wgfVar;
                awh1Var = awh1VarN;
                objP = objO;
            }
            return obj;
        }
        if (i2 == 1) {
            awh1Var = shfVar.c;
            str = shfVar.b;
            wgfVar2 = shfVar.a;
            hm5.M(objP);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            awh1Var2 = shfVar.d;
            awh1Var = shfVar.c;
            wgfVar3 = shfVar.a;
            hm5.M(objP);
        }
        awh1Var2.s((UploadImage) objP);
        wgfVar2 = wgfVar3;
        r771 r771Var = wgfVar2.c;
        q771 q771VarN = ShareFormat.n();
        q771VarN.n(r771Var.a.b());
        awh1Var.r(q771VarN.build());
        return awh1Var.build();
        awh1Var.n((UploadBackground) objP);
        awh1Var.q(str);
        fhf fhfVar = wgfVar2.b;
        if (fhfVar != null) {
            shfVar.a = wgfVar2;
            shfVar.b = null;
            shfVar.c = awh1Var;
            shfVar.d = awh1Var;
            shfVar.g = 2;
            objP = p(fhfVar, shfVar);
            if (objP != obj) {
                awh1Var2 = awh1Var;
                wgfVar3 = wgfVar2;
                awh1Var2.s((UploadImage) objP);
                wgfVar2 = wgfVar3;
            }
            return obj;
        }
        r771 r771Var2 = wgfVar2.c;
        q771 q771VarN2 = ShareFormat.n();
        q771VarN2.n(r771Var2.a.b());
        awh1Var.r(q771VarN2.build());
        return awh1Var.build();
    }

    public boolean k() {
        return ((l25) this.b).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(String str, onm onmVar) {
        k7c k7cVar;
        int i;
        zol zolVar;
        if (onmVar instanceof k7c) {
            k7cVar = (k7c) onmVar;
            int i2 = k7cVar.g;
            if ((i2 & os00.INVALID_ID) != 0) {
                k7cVar.g = i2 - os00.INVALID_ID;
            } else {
                k7cVar = new k7c(this, onmVar);
            }
        } else {
            k7cVar = new k7c(this, onmVar);
        }
        Object objA = k7cVar.e;
        int i3 = k7cVar.g;
        d9n d9nVar = d9n.a;
        try {
            if (i3 == 0) {
                hm5.M(objA);
                f7c f7cVar = (f7c) this.b;
                k7cVar.a = str;
                k7cVar.b = this;
                i = 0;
                k7cVar.d = 0;
                k7cVar.g = 1;
                objA = f7cVar.a(str, k7cVar);
                if (objA == d9nVar) {
                }
                return d9nVar;
            }
            if (i3 == 1) {
                int i4 = k7cVar.d;
                zwa zwaVar = k7cVar.b;
                String str2 = k7cVar.a;
                hm5.M(objA);
                i = i4;
                this = zwaVar;
                str = str2;
            } else {
                if (i3 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zolVar = k7cVar.c;
                hm5.M(objA);
            }
            return new xol(zolVar.a, (List) ((py21) objA).d(), zolVar.c);
            zol zolVar2 = (zol) ((py21) objA).d();
            ArrayList arrayList = zolVar2.b;
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((hpv0) it.next()).b);
            }
            if (arrayList2.isEmpty()) {
                throw new IOException("No sections found for uri: " + str);
            }
            f7c f7cVar2 = (f7c) this.b;
            q8c q8cVar = zolVar2.d;
            k7cVar.a = null;
            k7cVar.b = null;
            k7cVar.c = zolVar2;
            k7cVar.d = i;
            k7cVar.g = 2;
            Object objB = f7cVar2.b(arrayList2, q8cVar, k7cVar);
            if (objB != d9nVar) {
                objA = objB;
                zolVar = zolVar2;
                return new xol(zolVar.a, (List) ((py21) objA).d(), zolVar.c);
            }
            return d9nVar;
        } catch (Throwable th) {
            return new m231(th);
        }
    }

    public m6e0 m() {
        return bbp1.g(((ajq0) this.b).v());
    }

    public void n(String str, String str2, tv80 tv80Var, nk51 nk51Var) {
        ((ssf1) this.b).b(new dmf1(str, new lik1(str2), str2, new vsf1((String) null, (String) null, false, (String) null, true, false, true, false, false, true, (String) null, false, false, false, true, false, (ugo0) null, nk51Var, false, (g371) null, false, false, false, false, false, false, false, false, (p860) null, (String) null, false, false, -296017, 63), (Map) null), tv80Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(xgf xgfVar, onm onmVar) throws IOException {
        thf thfVar;
        yvh1 yvh1Var;
        if (onmVar instanceof thf) {
            thfVar = (thf) onmVar;
            int i = thfVar.e;
            if ((i & os00.INVALID_ID) != 0) {
                thfVar.e = i - os00.INVALID_ID;
            } else {
                thfVar = new thf(this, onmVar);
            }
        } else {
            thfVar = new thf(this, onmVar);
        }
        Object objP = thfVar.c;
        int i2 = thfVar.e;
        if (i2 == 0) {
            hm5.M(objP);
            fhf fhfVar = xgfVar.a;
            String str = xgfVar.b.a;
            if (fhfVar instanceof ehf) {
                yvh1 yvh1VarN = UploadBackground.n();
                ehf ehfVar = (ehf) fhfVar;
                s7h s7hVarN = Color.n();
                s7hVarN.n(String.format("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(ehfVar.b)}, 1)));
                Integer num = ehfVar.c;
                if (num != null) {
                    s7hVarN.q(String.format("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(num.intValue())}, 1)));
                }
                yvh1VarN.q(s7hVarN.build());
                yvh1VarN.n(str);
                return yvh1VarN.build();
            }
            if (!(fhfVar instanceof fhf)) {
                if (!(fhfVar instanceof ghf)) {
                    eg.o();
                    return null;
                }
                Uri uri = ((ghf) fhfVar).b;
                if (wmo1.l(uri)) {
                    hhg1.f(h4b1.d(uri, "Cannot upload local view as chat preview - "));
                    return null;
                }
                yvh1 yvh1VarN2 = UploadBackground.n();
                u6j1 u6j1VarN = Video.n();
                u6j1VarN.n(uri.toString());
                yvh1VarN2.s(u6j1VarN.build());
                yvh1VarN2.n(str);
                return yvh1VarN2.build();
            }
            yvh1 yvh1VarN3 = UploadBackground.n();
            thfVar.a = xgfVar;
            thfVar.b = yvh1VarN3;
            thfVar.e = 1;
            objP = p(fhfVar, thfVar);
            Object obj = d9n.a;
            if (objP == obj) {
                return obj;
            }
            yvh1Var = yvh1VarN3;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yvh1Var = thfVar.b;
            xgfVar = thfVar.a;
            hm5.M(objP);
        }
        yvh1Var.r((UploadImage) objP);
        yvh1Var.n(xgfVar.b.a);
        return yvh1Var.build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(fhf fhfVar, onm onmVar) throws IOException {
        uhf uhfVar;
        if (onmVar instanceof uhf) {
            uhfVar = (uhf) onmVar;
            int i = uhfVar.c;
            if ((i & os00.INVALID_ID) != 0) {
                uhfVar.c = i - os00.INVALID_ID;
            } else {
                uhfVar = new uhf(this, onmVar);
            }
        } else {
            uhfVar = new uhf(this, onmVar);
        }
        Object objJ = uhfVar.a;
        int i2 = uhfVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Uri uri = fhfVar.b;
            if (!wmo1.l(uri)) {
                ixh1 ixh1VarN = UploadImage.n();
                kp70 kp70VarN = Image.n();
                kp70VarN.n(uri.toString());
                ixh1VarN.q(kp70VarN.build());
                return ixh1VarN.build();
            }
            yfu yfuVar = (yfu) this.b;
            uhfVar.c = 1;
            objJ = yfuVar.j(uri, uhfVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        byte[] bArr = (byte[]) objJ;
        String strGuessContentTypeFromStream = URLConnection.guessContentTypeFromStream(new ByteArrayInputStream(bArr));
        if (strGuessContentTypeFromStream == null) {
            strGuessContentTypeFromStream = "application/octet-stream";
        }
        ixh1 ixh1VarN2 = UploadImage.n();
        lr70 lr70VarN = ImageBytes.n();
        lr70VarN.n(phc.e(0, bArr, bArr.length));
        lr70VarN.q(strGuessContentTypeFromStream);
        ixh1VarN2.n(lr70VarN.build());
        return ixh1VarN2.build();
    }

    public m3i1 q() {
        cxc cxcVar = (cxc) ((wp20) this.b).a;
        k370 k370Var = new k370();
        k370Var.i("https");
        k370Var.e("spclient.wg.spotify.com");
        l370 l370VarB = k370Var.b();
        ne neVar = new ne((byte) 10);
        neVar.a = cxcVar;
        neVar.h(l370VarB);
        neVar.c(new tpq0((byte) 1));
        return (m3i1) neVar.j().b(m3i1.class);
    }

    public void subscribe(CompletableEmitter completableEmitter) {
        ixg ixgVar = (ixg) this.b;
        vy70 vy70Var = ixgVar.b;
        vy70Var.e = new gxg(ixgVar, completableEmitter, (byte) 1);
        ixgVar.a.a(vy70Var.a());
    }

    public void v(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 22:
                String str = (String) obj;
                avn avnVar = (avn) obj2;
                ((TextView) avnVar.U0.Y).setText(str);
                ((TextView) avnVar.V0.findViewById(2131428380)).setText(str);
                break;
            default:
                Integer num = (Integer) obj;
                EncoreButton encoreButton = ((plr) obj2).a;
                num.getClass();
                encoreButton.setBackgroundTintList(plr.a(num.intValue()));
                break;
        }
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        esl1 esl1Var = hsl1Var.a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.b;
        if (!Objects.equals(coordinatorLayout.Q0, hsl1Var)) {
            coordinatorLayout.Q0 = hsl1Var;
            boolean z = hsl1Var.d() > 0;
            coordinatorLayout.R0 = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!esl1Var.s()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = b8k1.a;
                    if (childAt.getFitsSystemWindows() && childAt.getLayoutParams().a != null && esl1Var.s()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return hsl1Var;
    }

    public void c() {
    }

    public void a(TotalCaptureResult totalCaptureResult) {
    }

    public void d(fp8 fp8Var) {
    }

    public zwa(vh70 vh70Var) {
        this.a = (byte) 0;
        zod.s(vh70Var);
        this.b = vh70Var;
    }

    public zwa(yfu yfuVar, pob pobVar) {
        this.a = (byte) 10;
        this.b = yfuVar;
    }

    public /* synthetic */ zwa(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
