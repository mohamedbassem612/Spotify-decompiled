package p;

import com.spotify.address.endpoint.model.v1.proto.FieldValue;
import com.spotify.address.endpoint.model.v1.proto.GetAddressFieldsRequest;
import com.spotify.address.endpoint.model.v1.proto.GetAddressFieldsResponse;
import com.spotify.address.endpoint.model.v1.proto.SearchAddressResult;
import com.spotify.address.endpoint.model.v1.proto.SearchAddressesRequest;
import com.spotify.address.endpoint.model.v1.proto.SearchAddressesResponse;
import com.spotify.encoremobile.component.buttons.EncoreProgressIndicatorButton;
import java.util.Collections;
import java.util.Locale;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uug0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uug0(boolean z, obj0 obj0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 6;
        this.b = z;
        this.c = obj0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new uug0(obj2, lnmVar, (byte) 0);
            case 1:
                return new uug0(obj2, lnmVar, (byte) 1);
            case 2:
                return new uug0((pt) obj2, this.b, lnmVar);
            case 3:
                return new uug0(obj2, lnmVar, (byte) 3);
            case 4:
                return new uug0(obj2, lnmVar, (byte) 4);
            case 5:
                return new uug0(obj2, lnmVar, (byte) 5);
            case 6:
                return new uug0(this.b, (obj0) obj2, lnmVar);
            case 7:
                return new uug0(obj2, lnmVar, (byte) 7);
            case 8:
                return new uug0(obj2, lnmVar, (byte) 8);
            case 9:
                return new uug0(obj2, lnmVar, (byte) 9);
            case 10:
                return new uug0(obj2, lnmVar, (byte) 10);
            case 11:
                return new uug0(obj2, lnmVar, (byte) 11);
            case 12:
                return new uug0(obj2, lnmVar, (byte) 12);
            case 13:
                return new uug0(obj2, lnmVar, (byte) 13);
            case 14:
                return new uug0(obj2, lnmVar, (byte) 14);
            case 15:
                return new uug0(obj2, lnmVar, (byte) 15);
            case 16:
                return new uug0(obj2, lnmVar, (byte) 16);
            case 17:
                return new uug0(obj2, lnmVar, (byte) 17);
            case 18:
                return new uug0(obj2, lnmVar, (byte) 18);
            case 19:
                return new uug0(obj2, lnmVar, (byte) 19);
            case 20:
                return new uug0(obj2, lnmVar, (byte) 20);
            case 21:
                return new uug0(obj2, lnmVar, (byte) 21);
            case 22:
                return new uug0(obj2, lnmVar, (byte) 22);
            case 23:
                return new uug0(obj2, lnmVar, (byte) 23);
            case 24:
                return new uug0(obj2, lnmVar, (byte) 24);
            case 25:
                return new uug0(obj2, lnmVar, (byte) 25);
            case 26:
                return new uug0(obj2, lnmVar, (byte) 26);
            case 27:
                return new uug0(obj2, lnmVar, (byte) 27);
            case 28:
                return new uug0(obj2, lnmVar, (byte) 28);
            default:
                return new uug0(obj2, lnmVar, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 18:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((dr90) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:250:0x0765  */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object objCollect;
        lnm lnmVar;
        p1e0 huzVar;
        Object objA;
        byte b = this.a;
        byte b2 = 28;
        byte b3 = 6;
        byte b4 = 22;
        byte b5 = 18;
        d9n d9nVar = rih1.a;
        d9n d9nVar2 = d9n.a;
        Object obj2 = this.c;
        lnm lnmVar2 = null;
        switch (b) {
            case 0:
                vug0 vug0Var = (vug0) obj2;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    m441 m441VarQ = rwq.q(new g030(vug0Var, (byte) 17));
                    l4f0 l4f0Var = new l4f0(vug0Var, (lnm) null, (byte) 4);
                    this.b = true;
                    if (l4p1.q(m441VarQ, l4f0Var, this) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return d9nVar;
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
                byg0 byg0Var = (byg0) obj2;
                this.b = true;
                ohd ohdVar = new ohd(1, aym.t(this));
                ohdVar.t();
                c78 c78Var = new c78(byg0Var, ohdVar, (byte) 3);
                byg0Var.i.a(c78Var);
                ohdVar.n(new j2d0(byg0Var, c78Var, b2));
                Object objR = ohdVar.r();
                return objR == d9nVar2 ? d9nVar2 : objR;
            case 2:
                hm5.M(obj);
                ((ysh0) ((pt) obj2).g).a.setValue(Boolean.valueOf(this.b));
                return d9nVar;
            case 3:
                wwh0 wwh0Var = (wwh0) obj2;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    evz evzVarC = wwh0Var.d.c();
                    p5b0 p5b0Var = new p5b0(wwh0Var, (byte) 15);
                    this.b = true;
                    if (evzVarC.collect(p5b0Var, this) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                wwh0Var.c();
                return d9nVar;
            case 4:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    wp20 wp20Var = (wp20) obj2;
                    this.b = true;
                    objCollect = rqt0.t(new f8f0((mr20) wp20Var.b, (byte) 17), new ry90(wp20Var, (byte) 18)).collect(new p5b0(wp20Var, (byte) 16), this);
                    if (objCollect != d9nVar2) {
                    }
                    if (objCollect == d9nVar2) {
                        objCollect = d9nVar;
                        return d9nVar2;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                objCollect = d9nVar;
                return d9nVar;
            case 5:
                e4j0 e4j0Var = (e4j0) obj2;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    int i = e4j0.k;
                    mr20 mr20VarU = rqt0.u(new tf2(hu20.e(e4j0Var.h, new zz90((lnm) null, h5p1.s((at71) e4j0Var.e.getValue(), e4j0Var.f, e4j0Var.g, c4j0.h), (byte) 22)), (byte) 18));
                    hyg0 hyg0Var = new hyg0(e4j0Var, (lnm) null, b3);
                    this.b = true;
                    if (l4p1.q(mr20VarU, hyg0Var, this) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return d9nVar;
            case 6:
                hm5.M(obj);
                if (this.b) {
                    ((obj0) obj2).d.a(ixb.b);
                }
                return d9nVar;
            case 7:
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    f1n0 f1n0Var = ((txj0) obj2).b;
                    this.b = true;
                    if (f1n0Var.a(this) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return d9nVar;
            case 8:
                v8k0 v8k0Var = (v8k0) obj2;
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    s24 s24Var = v8k0Var.e;
                    cbk0 cbk0Var = (cbk0) s24Var.c;
                    String str = cbk0Var.d;
                    f4r ip7Var = (str == null || str == null || cbk0Var.a.length() != 0) ? null : new ip7(s24Var, str, (byte) 1);
                    if (ip7Var != null) {
                        huzVar = new p1e0(d3p1.G(v8k0Var.d, ip7Var, d9nVar), (byte) 20);
                        lnmVar = null;
                    } else {
                        lnmVar = null;
                        huzVar = new huz(new i1r(d9nVar, (Integer) null), (byte) 10);
                    }
                    lt0 lt0VarA = hu20.a(hu20.a(huzVar, new d7i0(v8k0Var, lnmVar, b5)), new hyg0((Object) v8k0Var, lnmVar, (byte) 11));
                    p5b0 p5b0Var2 = new p5b0(v8k0Var, (byte) 21);
                    this.b = true;
                    if (lt0VarA.collect(p5b0Var2, this) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return d9nVar;
            case 9:
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    ro8 ro8VarN = ((xbm) obj2).n();
                    this.b = true;
                    ro8VarN.invoke(this);
                    if (d9nVar == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return d9nVar;
            case 10:
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(200L, this) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                cbm0 cbm0Var = cbm0.a;
                String strN = ((GetAddressFieldsRequest) obj2).n();
                if (strN != null) {
                    switch (strN) {
                        case "1":
                            pk40 pk40VarP = GetAddressFieldsResponse.p();
                            g320 g320VarN = FieldValue.n();
                            g320VarN.n("street");
                            g320VarN.q("Clementina Street");
                            g320 g320VarN2 = FieldValue.n();
                            g320VarN2.n("city");
                            g320VarN2.q("San Francisco");
                            g320 g320VarN3 = FieldValue.n();
                            g320VarN3.n("state");
                            g320VarN3.q("DC");
                            g320 g320VarN4 = FieldValue.n();
                            g320VarN4.n("zip");
                            g320VarN4.q("12345");
                            pk40VarP.n(p7h.M(new FieldValue[]{g320VarN.build(), g320VarN2.build(), g320VarN3.build(), g320VarN4.build()}));
                            GetAddressFieldsResponse getAddressFieldsResponseBuild = pk40VarP.build();
                            getAddressFieldsResponseBuild.getClass();
                            return getAddressFieldsResponseBuild;
                        case "2":
                            pk40 pk40VarP2 = GetAddressFieldsResponse.p();
                            g320 g320VarN5 = FieldValue.n();
                            g320VarN5.n("street");
                            g320VarN5.q("Brooklyn Street");
                            g320 g320VarN6 = FieldValue.n();
                            g320VarN6.n("city");
                            g320VarN6.q("Brooklyn");
                            g320 g320VarN7 = FieldValue.n();
                            g320VarN7.n("state");
                            g320VarN7.q("AL");
                            g320 g320VarN8 = FieldValue.n();
                            g320VarN8.n("zip");
                            g320VarN8.q("12345");
                            pk40VarP2.n(p7h.M(new FieldValue[]{g320VarN5.build(), g320VarN6.build(), g320VarN7.build(), g320VarN8.build()}));
                            GetAddressFieldsResponse getAddressFieldsResponseBuild2 = pk40VarP2.build();
                            getAddressFieldsResponseBuild2.getClass();
                            return getAddressFieldsResponseBuild2;
                        case "3":
                            pk40 pk40VarP3 = GetAddressFieldsResponse.p();
                            g320 g320VarN9 = FieldValue.n();
                            g320VarN9.n("street");
                            g320VarN9.q("Seaside Street");
                            g320 g320VarN10 = FieldValue.n();
                            g320VarN10.n("city");
                            g320VarN10.q("Seaside");
                            g320 g320VarN11 = FieldValue.n();
                            g320VarN11.n("state");
                            g320VarN11.q("FL");
                            g320 g320VarN12 = FieldValue.n();
                            g320VarN12.n("zip");
                            g320VarN12.q("3489");
                            pk40VarP3.n(p7h.M(new FieldValue[]{g320VarN9.build(), g320VarN10.build(), g320VarN11.build(), g320VarN12.build()}));
                            GetAddressFieldsResponse getAddressFieldsResponseBuild3 = pk40VarP3.build();
                            getAddressFieldsResponseBuild3.getClass();
                            return getAddressFieldsResponseBuild3;
                        case "4":
                            pk40 pk40VarP4 = GetAddressFieldsResponse.p();
                            g320 g320VarN13 = FieldValue.n();
                            g320VarN13.n("street");
                            g320VarN13.q("Ohio Street");
                            g320 g320VarN14 = FieldValue.n();
                            g320VarN14.n("city");
                            g320VarN14.q("Palm Coast");
                            g320 g320VarN15 = FieldValue.n();
                            g320VarN15.n("state");
                            g320VarN15.q("OH");
                            g320 g320VarN16 = FieldValue.n();
                            g320VarN16.n("zip");
                            g320VarN16.q("9874");
                            pk40VarP4.n(p7h.M(new FieldValue[]{g320VarN13.build(), g320VarN14.build(), g320VarN15.build(), g320VarN16.build()}));
                            GetAddressFieldsResponse getAddressFieldsResponseBuild4 = pk40VarP4.build();
                            getAddressFieldsResponseBuild4.getClass();
                            return getAddressFieldsResponseBuild4;
                        case "5":
                            k220.i("Mock network error on getAddressFields");
                            break;
                        default:
                            if (strN.equals("1")) {
                                pk40 pk40VarP5 = GetAddressFieldsResponse.p();
                                g320 g320VarN17 = FieldValue.n();
                                g320VarN17.n("street");
                                g320VarN17.q("Clementina Street");
                                g320 g320VarN18 = FieldValue.n();
                                g320VarN18.n("city");
                                g320VarN18.q("San Francisco");
                                g320 g320VarN19 = FieldValue.n();
                                g320VarN19.n("state");
                                g320VarN19.q("DC");
                                g320 g320VarN20 = FieldValue.n();
                                g320VarN20.n("zip");
                                g320VarN20.q("12345");
                                pk40VarP5.n(p7h.M(new FieldValue[]{g320VarN17.build(), g320VarN18.build(), g320VarN19.build(), g320VarN20.build()}));
                                GetAddressFieldsResponse getAddressFieldsResponseBuild5 = pk40VarP5.build();
                                getAddressFieldsResponseBuild5.getClass();
                                return getAddressFieldsResponseBuild5;
                            }
                            hhg1.n("Uh oh network error");
                            break;
                    }
                } else {
                    hhg1.n("Uh oh network error");
                }
                return null;
            case 11:
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                this.b = true;
                if (hap1.i(200L, this) == d9nVar2) {
                    return d9nVar2;
                }
                cbm0 cbm0Var2 = cbm0.a;
                SearchAddressesRequest searchAddressesRequest = (SearchAddressesRequest) obj2;
                String lowerCase = searchAddressesRequest.n().toLowerCase(Locale.ROOT);
                switch (lowerCase) {
                    case "one":
                        kv41 kv41VarP = SearchAddressesResponse.p();
                        iv41 iv41VarO = SearchAddressResult.o();
                        iv41VarO.n("1");
                        iv41VarO.q("Clementina Street, San Francisco, CA");
                        kv41VarP.n(Collections.singletonList(iv41VarO.build()));
                        SearchAddressesResponse searchAddressesResponseBuild = kv41VarP.build();
                        searchAddressesResponseBuild.getClass();
                        return searchAddressesResponseBuild;
                    case "two":
                        kv41 kv41VarP2 = SearchAddressesResponse.p();
                        iv41 iv41VarO2 = SearchAddressResult.o();
                        iv41VarO2.n("1");
                        iv41VarO2.q("Clementina Street, San Francisco, CA");
                        iv41 iv41VarO3 = SearchAddressResult.o();
                        iv41VarO3.n("2");
                        iv41VarO3.q("Clementina Street, Brooklyn, NY");
                        kv41VarP2.n(p7h.M(new SearchAddressResult[]{iv41VarO2.build(), iv41VarO3.build()}));
                        SearchAddressesResponse searchAddressesResponseBuild2 = kv41VarP2.build();
                        searchAddressesResponseBuild2.getClass();
                        return searchAddressesResponseBuild2;
                    case "error":
                        k220.i("Mock network error on SearchAddressesRequest");
                        return null;
                    case "nothing":
                        kv41 kv41VarP3 = SearchAddressesResponse.p();
                        kv41VarP3.n(z6x.a);
                        SearchAddressesResponse searchAddressesResponseBuild3 = kv41VarP3.build();
                        searchAddressesResponseBuild3.getClass();
                        return searchAddressesResponseBuild3;
                    default:
                        if (lowerCase.equals("one")) {
                            kv41 kv41VarP4 = SearchAddressesResponse.p();
                            iv41 iv41VarO4 = SearchAddressResult.o();
                            iv41VarO4.n("1");
                            iv41VarO4.q("Clementina Street, San Francisco, CA");
                            kv41VarP4.n(Collections.singletonList(iv41VarO4.build()));
                            SearchAddressesResponse searchAddressesResponseBuild4 = kv41VarP4.build();
                            searchAddressesResponseBuild4.getClass();
                            return searchAddressesResponseBuild4;
                        }
                        kv41 kv41VarP5 = SearchAddressesResponse.p();
                        iv41 iv41VarO5 = SearchAddressResult.o();
                        iv41VarO5.n("1");
                        iv41VarO5.q(searchAddressesRequest.n().length() + " Clementina Street, San Francisco, CA");
                        iv41 iv41VarO6 = SearchAddressResult.o();
                        iv41VarO6.n("2");
                        iv41VarO6.q(searchAddressesRequest.n().length() + " Lemon Street, Brooklyn, NY");
                        iv41 iv41VarO7 = SearchAddressResult.o();
                        iv41VarO7.n("3");
                        iv41VarO7.q(searchAddressesRequest.n().length() + " Pineapple Street, Seaside, CA");
                        iv41 iv41VarO8 = SearchAddressResult.o();
                        iv41VarO8.n("4");
                        iv41VarO8.q(searchAddressesRequest.n().length() + " Strawberry Court, Palm Coast, FL");
                        iv41 iv41VarO9 = SearchAddressResult.o();
                        iv41VarO9.n("5");
                        iv41VarO9.q("Clementina Avenue, Austin, TX");
                        kv41VarP5.n(p7h.M(new SearchAddressResult[]{iv41VarO5.build(), iv41VarO6.build(), iv41VarO7.build(), iv41VarO8.build(), iv41VarO9.build()}));
                        SearchAddressesResponse searchAddressesResponseBuild5 = kv41VarP5.build();
                        searchAddressesResponseBuild5.getClass();
                        return searchAddressesResponseBuild5;
                }
            case 12:
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    o95 o95Var = ((sdm0) obj2).e;
                    Float f = new Float(0.0f);
                    this.b = true;
                    if (o95.b(o95Var, f, (fe5) null, (Float) null, (iu30) null, this, 14) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return d9nVar;
            case 13:
                uem0 uem0Var = (uem0) obj2;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    mr20 mr20Var = uem0Var.n;
                    mr20 mr20Var2 = uem0Var.o;
                    ce2 ce2Var = new ce2(3, (lnm) null, (byte) 27);
                    p5b0 p5b0Var3 = new p5b0(uem0Var, (byte) 24);
                    this.b = true;
                    Object objS = fc11.s(vrl.c, this, p5b0Var3, new ekv(ce2Var, (lnm) null), new mr20[]{mr20Var, mr20Var2});
                    if (objS != d9nVar2) {
                        objS = d9nVar;
                    }
                    if (objS == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z12) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return d9nVar;
            case 14:
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                emm0 emm0Var = ((kmm0) obj2).a;
                this.b = true;
                Object objA2 = emm0Var.a("track-uri", 100, this);
                return objA2 == d9nVar2 ? d9nVar2 : objA2;
            case 15:
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bbc bbcVar = ((wnm0) obj2).g;
                this.b = true;
                Object objS2 = smo1.s(new m3n0(bbcVar, lnmVar2, (byte) 21), this);
                return objS2 == d9nVar2 ? d9nVar2 : objS2;
            case 16:
                ty60 ty60Var = ((wrm0) obj2).g;
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    ty60Var.b();
                    this.b = true;
                    if (ty60Var.a(this) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return d9nVar;
            case 17:
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                fdc fdcVar = (fdc) obj2;
                bpb1 bpb1Var = (bpb1) ((w590) fdcVar.d).i.b;
                p5b0 p5b0Var4 = new p5b0(fdcVar, (byte) 26);
                this.b = true;
                bpb1Var.collect(p5b0Var4, this);
                return d9nVar2;
            case 18:
                utm0 utm0Var = (utm0) obj2;
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bpb1 bpb1VarE = utm0Var.c.e();
                p5b0 p5b0Var5 = new p5b0(utm0Var, (byte) 27);
                this.b = true;
                bpb1VarE.collect(p5b0Var5, this);
                return d9nVar2;
            case 19:
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
                ve01 ve01Var = ((p8n0) obj2).i;
                this.b = true;
                Object objI = b5p1.i(ve01Var, this);
                return objI == d9nVar2 ? d9nVar2 : objI;
            case 20:
                sfn0 sfn0Var = (sfn0) obj2;
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    mr20 mr20VarA = sfn0Var.b.a();
                    p5b0 p5b0Var6 = new p5b0(sfn0Var, (byte) 28);
                    this.b = true;
                    Object objCollect2 = mr20VarA.collect(new mcn0(p5b0Var6, (byte) 4), this);
                    if (objCollect2 != d9nVar2) {
                        objCollect2 = d9nVar;
                    }
                    if (objCollect2 == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z19) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return d9nVar;
            case 21:
                bun0 bun0Var = (bun0) obj2;
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    jge jgeVarA = bun0Var.a.a("hm://device-proxy/v1/navigation", new lbc0(1, bun0Var, bun0.class, "convert", "convert(Lcom/spotify/connectivity/pubsub/DealerMessage$PushedMessage;)Lcom/spotify/deviceproxy/navigation/v1/NavigationCommand;", 0, (byte) 28));
                    p5b0 p5b0Var7 = new p5b0(bun0Var, (byte) 29);
                    this.b = true;
                    Object objCollect3 = jgeVarA.collect(new ygi0(new mcn0(new mcn0(p5b0Var7, (byte) 7), (byte) 6), bun0Var, (byte) 14), this);
                    if (objCollect3 != d9nVar2) {
                        objCollect3 = d9nVar;
                    }
                    if (objCollect3 != d9nVar2) {
                        objCollect3 = d9nVar;
                    }
                    if (objCollect3 != d9nVar2) {
                        objCollect3 = d9nVar;
                    }
                    if (objCollect3 == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z20) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return d9nVar;
            case 22:
                hun0 hun0Var = (hun0) obj2;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    cun0 cun0Var = hun0Var.a;
                    this.b = true;
                    if (cun0Var.b(this) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z21) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                hun0Var.c = true;
                return d9nVar;
            case 23:
                qzn0 qzn0Var = (qzn0) obj2;
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    if (!(qzn0Var.b.a() instanceof iue0)) {
                        eqn0 eqn0Var = eqn0.a;
                        this.b = true;
                        if (qzn0Var.e(eqn0Var, this) == d9nVar2) {
                            return d9nVar2;
                        }
                    }
                } else {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return d9nVar;
            case 24:
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    long jC = ((no4) ((m2o0) obj2).c.a.get()).c();
                    this.b = true;
                    if (hap1.i(jC, this) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z23) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return d9nVar;
            case 25:
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    v4o0 v4o0Var = ((u2o0) obj2).b;
                    n4o0 n4o0Var = new n4o0(l0o0.a, o0o0.a, m0o0.a);
                    this.b = true;
                    if (v4o0Var.b(n4o0Var, this) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z24) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return d9nVar;
            case 26:
                afo0 afo0Var = (afo0) obj2;
                boolean z25 = this.b;
                if (!z25) {
                    hm5.M(obj);
                    zik1 zik1Var = afo0Var.x1;
                    String str2 = afo0Var.u1.a;
                    this.b = true;
                    objA = zik1Var.a(str2, this);
                    if (objA == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z25) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA = ((e331) obj).a;
                }
                l4p1.u(afo0Var.B1, new fu20(new lt20(new any(hu20.c(hu20.e(new fu20(rqt0.u(new qsc0(new any(afo0Var.y1, (byte) 18), afo0Var, objA, (byte) 12)), new yeo0(afo0Var, (lnm) null), (byte) 1), new t4o0((lnm) null, afo0Var, (byte) 1)), new m3n0(afo0Var, lnmVar2, b4)), (byte) 18), new ob00(3, (lnm) null, (byte) 12), (byte) 0), new u98(2, afo0Var, afo0.class, "recordImpression", "recordImpression(J)V", 4, (byte) 12), (byte) 1));
                return d9nVar;
            case 27:
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(300L, this) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z26) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((EncoreProgressIndicatorButton) obj2).setShowProgressIndicator(true);
                return d9nVar;
            case 28:
                boolean z27 = this.b;
                if (z27) {
                    if (z27) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.b = true;
                String str3 = gqo0.r;
                Object objB = ((gqo0) obj2).b(this);
                return objB == d9nVar2 ? d9nVar2 : objB;
            default:
                boolean z28 = this.b;
                if (!z28) {
                    hm5.M(obj);
                    this.b = true;
                    if (((za80) obj2).invoke(this) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z28) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return d9nVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uug0(pt ptVar, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.c = ptVar;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uug0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }
}
