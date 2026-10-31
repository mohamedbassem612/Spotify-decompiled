package p;

import android.os.Build;
import com.spotify.read_reporting_esperanto.proto.ReadEndRequest;
import com.spotify.read_reporting_esperanto.proto.ReadStartRequest;
import com.spotify.read_reporting_esperanto.proto.ReadUpdateRequest;
import com.spotify.wrapped.v1.proto.Image;
import com.spotify.wrapped.v1.proto.RiveAnimationInput;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ob01 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ob01(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                return new ob01((qb01) this.c, (ReadEndRequest) obj, lnmVar, (byte) 0);
            case 1:
                return new ob01((qb01) this.c, (ReadStartRequest) obj, lnmVar, (byte) 1);
            case 2:
                return new ob01((qb01) this.c, (ReadUpdateRequest) obj, lnmVar, (byte) 2);
            case 3:
                return new ob01((x711) this.c, (String) obj, lnmVar, (byte) 3);
            case 4:
                return new ob01((x711) this.c, (bqr0) obj, lnmVar, (byte) 4);
            case 5:
                return new ob01((k811) this.c, (String) obj, lnmVar, (byte) 5);
            case 6:
                return new ob01((k811) this.c, (q431) obj, lnmVar, (byte) 6);
            case 7:
                return new ob01((k811) this.c, (h631) obj, lnmVar, (byte) 7);
            case 8:
                return new ob01((i531) this.c, (w531) obj, lnmVar, (byte) 8);
            case 9:
                return new ob01((s531) this.c, (d631) obj, lnmVar, (byte) 9);
            case 10:
                return new ob01((cxc) this.c, (RiveAnimationInput) obj, lnmVar, (byte) 10);
            case 11:
                return new ob01((ti31) this.c, (String) obj, lnmVar, (byte) 11);
            case 12:
                return new ob01((em31) this.c, (String) obj, lnmVar, (byte) 12);
            case 13:
                return new ob01((kdy0) this.c, (jvy0) obj, lnmVar, (byte) 13);
            case 14:
                return new ob01((kdy0) this.c, (pr81) obj, lnmVar, (byte) 14);
            case 15:
                return new ob01((l041) this.c, (List) obj, lnmVar, (byte) 15);
            case 16:
                return new ob01((y7h0) this.c, (y591) obj, lnmVar, (byte) 16);
            case 17:
                return new ob01((my91) this.c, (ArrayList) obj, lnmVar, (byte) 17);
            case 18:
                return new ob01((jwd1) obj, lnmVar);
            case 19:
                return new ob01((SceneTemplate.TopAlbumsContent.Single) this.c, (t7f1) obj, lnmVar, (byte) 19);
            case 20:
                return new ob01((SceneTemplate.TopPlaylistsContent.Single) this.c, (t7f1) obj, lnmVar, (byte) 20);
            case 21:
                return new ob01((SceneTemplate.TopSongJourneyContent.SongEntry) this.c, (gw70) obj, lnmVar, (byte) 21);
            case 22:
                return new ob01((SceneTemplate.WrappedTwinContent.GiftCard) this.c, (vh6) obj, lnmVar, (byte) 22);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new ob01((vf2) this.c, (g0l) obj, lnmVar, (byte) 23);
            case 24:
                return new ob01((SceneTemplate.WrappedPlacesContent.Card2) this.c, (odm1) obj, lnmVar, (byte) 24);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new ob01((Image) this.c, (odm1) obj, lnmVar, (byte) 25);
            default:
                return new ob01((rvo1) this.c, (vfo1) obj, lnmVar, (byte) 26);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                break;
            case 24:
                break;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        Object objF;
        String str;
        Object objB;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        u3k u3kVar = u3k.a;
        Object obj2 = this.d;
        Serializable serializable = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                jn7 jn7Var = ((qb01) this.c).a;
                ReadEndRequest readEndRequest = (ReadEndRequest) obj2;
                readEndRequest.getClass();
                this.b = true;
                Object objZ = jn7Var.Z(readEndRequest, this);
                return objZ == serializable ? serializable : objZ;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                jn7 jn7Var2 = ((qb01) this.c).a;
                ReadStartRequest readStartRequest = (ReadStartRequest) obj2;
                readStartRequest.getClass();
                this.b = true;
                Object objA0 = jn7Var2.a0(readStartRequest, this);
                return objA0 == serializable ? serializable : objA0;
            case 2:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                jn7 jn7Var3 = ((qb01) this.c).a;
                ReadUpdateRequest readUpdateRequest = (ReadUpdateRequest) obj2;
                readUpdateRequest.getClass();
                this.b = true;
                Object objB0 = jn7Var3.b0(readUpdateRequest, this);
                return objB0 == serializable ? serializable : objB0;
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    this.b = true;
                    Object objF2 = ((x711) this.c).d.f((String) obj2, this);
                    return objF2 == serializable ? serializable : objF2;
                }
                if (z4) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                rsc0 rsc0Var = ((x711) this.c).k;
                String str2 = ((bqr0) obj2).a.b;
                this.b = true;
                rsc0 rsc0Var2 = rsc0Var;
                Object objH = c921.H(rsc0Var2.c, new fsc0(rsc0Var2, str2, (lnm) null), this);
                return objH == serializable ? serializable : objH;
            case 5:
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ixg ixgVarF = ((gw70) ((k811) this.c).d).f((String) obj2);
                ixgVarF.g = false;
                Single singleI = ixgVarF.i();
                this.b = true;
                Object objJ = fc11.j(singleI, this);
                return objJ == serializable ? serializable : objJ;
            case 6:
                q431 q431Var = (q431) obj2;
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dn3 dn3Var = (dn3) ((k811) this.c).c;
                String url = q431Var.getUrl();
                String url2 = q431Var.getUrl();
                this.b = true;
                Object objI = dn3Var.i(url, url2, this);
                return objI == serializable ? serializable : objI;
            case 7:
                h631 h631Var = (h631) obj2;
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dn3 dn3Var2 = (dn3) ((k811) this.c).c;
                String url3 = h631Var.f.getUrl();
                String strI = xcg1.i(h631Var.f.getUrl(), ":", h631Var.d);
                this.b = true;
                Object objI2 = dn3Var2.i(url3, strI, this);
                return objI2 == serializable ? serializable : objI2;
            case 8:
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    this.b = true;
                    Object objA = ((i531) this.c).a((w531) obj2, this);
                    return objA == serializable ? serializable : objA;
                }
                if (z9) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                cz30 cz30Var = ((s531) this.c).i;
                String str3 = ((d631) obj2).w;
                this.b = true;
                return cz30Var.c(str3, this) == serializable ? serializable : rih1Var;
            case 10:
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                cxc cxcVar = (cxc) this.c;
                String imageUrl = ((RiveAnimationInput) obj2).n().getImageUrl();
                this.b = true;
                Object objB2 = bin.B(cxcVar, imageUrl, this);
                return objB2 == serializable ? serializable : objB2;
            case 11:
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    this.b = true;
                    Serializable serializableC = ((ti31) this.c).c((String) obj2, this);
                    return serializableC == serializable ? serializable : serializableC;
                }
                if (z12) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    this.b = true;
                    Object objB3 = ((em31) this.c).b((String) obj2, this);
                    return objB3 == serializable ? serializable : objB3;
                }
                if (z13) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                jvy0 jvy0Var = (jvy0) obj2;
                Completable completableA = ((nm31) ((kdy0) this.c).c).a(jvy0Var.a, jvy0Var.b, jvy0Var.c, jvy0Var.d, jvy0Var.e, "android", jvy0Var.f, jvy0Var.h);
                this.b = true;
                return fc11.i(completableA, this) == serializable ? serializable : rih1Var;
            case 14:
                kdy0 kdy0Var = (kdy0) this.c;
                pr81 pr81Var = (pr81) obj2;
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    Completable completableB = ((nm31) kdy0Var.c).b(new sr81(pr81Var.a, String.valueOf(((yqg) kdy0Var.d).b()), pr81Var.b, String.valueOf(Build.VERSION.SDK_INT), pr81Var.c, pr81Var.d));
                    this.b = true;
                    return fc11.i(completableB, this) == serializable ? serializable : rih1Var;
                }
                if (z15) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Observable observableFilter = ((l041) this.c).b.b(new oi("running-share-card", false, new nec0((List) obj2, (byte) 17))).filter(kcx0.h);
                this.b = true;
                Object objL = fc11.l(observableFilter, 1, (Object) null, this);
                return objL == serializable ? serializable : objL;
            case 16:
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        objF = ((e331) obj).a;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                y7h0 y7h0Var = (y7h0) this.c;
                String str4 = ((y591) obj2).a;
                this.b = true;
                objF = y7h0Var.f(str4, this);
                if (objF == serializable) {
                    return serializable;
                }
                if (!(objF instanceof m231)) {
                    int iOrdinal = ((swt0) objF).ordinal();
                    if (iOrdinal == 0) {
                        objF = r591.b;
                    } else {
                        if (iOrdinal != 1) {
                            eg.o();
                            return null;
                        }
                        objF = r591.c;
                    }
                }
                Object obj3 = objF;
                hm5.M(obj3);
                return obj3;
            case 17:
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                my91 my91Var = (my91) this.c;
                q8n q8nVar = my91Var.h;
                sb91 sb91Var = new sb91(my91Var, (ArrayList) obj2, (lnm) null, (byte) 9);
                this.b = true;
                Object objY = fn31.Y(q8nVar, sb91Var, this);
                return objY == serializable ? serializable : objY;
            case 18:
                boolean z19 = this.b;
                if (z19) {
                    if (!z19) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str5 = (String) this.c;
                    hm5.M(obj);
                    str = str5;
                    objB = obj;
                    return new kwd1(str, (bwd1) objB);
                }
                hm5.M(obj);
                jwd1 jwd1Var = (jwd1) obj2;
                str = jwd1Var.a.b;
                if (str == null) {
                    eg.m("Date of birth required");
                    return null;
                }
                axd1 axd1Var = jwd1Var.e;
                this.c = str;
                this.b = true;
                objB = axd1Var.b(this);
                if (objB == serializable) {
                    return serializable;
                }
                return new kwd1(str, (bwd1) objB);
            case 19:
                boolean z20 = this.b;
                if (z20) {
                    if (z20) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Image imageN = ((SceneTemplate.TopAlbumsContent.Single) this.c).n();
                gw70 gw70Var = ((t7f1) obj2).b;
                this.b = true;
                Object objK = u3kVar.k(imageN, gw70Var, this);
                return objK == serializable ? serializable : objK;
            case 20:
                boolean z21 = this.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Image imageR = ((SceneTemplate.TopPlaylistsContent.Single) this.c).r();
                gw70 gw70Var2 = ((t7f1) obj2).b;
                this.b = true;
                Object objK2 = u3kVar.k(imageR, gw70Var2, this);
                return objK2 == serializable ? serializable : objK2;
            case 21:
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    this.b = true;
                    Object objK3 = u3kVar.k(((SceneTemplate.TopSongJourneyContent.SongEntry) this.c).o(), (gw70) obj2, this);
                    return objK3 == serializable ? serializable : objK3;
                }
                if (z22) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                boolean z23 = this.b;
                if (z23) {
                    if (z23) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Image imageR2 = ((SceneTemplate.WrappedTwinContent.GiftCard) this.c).r();
                gw70 gw70Var3 = (gw70) ((vh6) obj2).d;
                this.b = true;
                Object objK4 = u3kVar.k(imageR2, gw70Var3, this);
                return objK4 == serializable ? serializable : objK4;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    this.b = true;
                    return ((vf2) this.c).f((g0l) obj2, this) == serializable ? serializable : rih1Var;
                }
                if (z24) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 24:
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String strO = ((SceneTemplate.WrappedPlacesContent.Card2) this.c).B().o();
                gw70 gw70Var4 = ((odm1) obj2).c;
                this.b = true;
                Object objG = u3kVar.g(strO, gw70Var4, false, this);
                return objG == serializable ? serializable : objG;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Image image = (Image) this.c;
                gw70 gw70Var5 = ((odm1) obj2).c;
                this.b = true;
                Object objK5 = u3kVar.k(image, gw70Var5, this);
                return objK5 == serializable ? serializable : objK5;
            default:
                boolean z27 = this.b;
                hm5.M(obj);
                if (z27) {
                    return obj;
                }
                rvo1 rvo1Var = (rvo1) this.c;
                ukl1 ukl1Var = new ukl1((vfo1) obj2, null, (byte) 4);
                this.b = true;
                rvo1Var.getClass();
                Object objA2 = new nwo1(54, ukl1Var, (Integer) null).a(rvo1Var.a, this);
                return objA2 == serializable ? serializable : objA2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob01(jwd1 jwd1Var, lnm lnmVar) {
        super(1, lnmVar);
        this.a = (byte) 18;
        this.d = jwd1Var;
    }
}
