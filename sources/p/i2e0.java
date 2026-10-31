package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.local_files_esperanto.proto.EsLocalFiles;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i2e0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ i2e0(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:129:0x021d  */
    /* JADX WARN: Code duplicated, block: B:144:0x025e  */
    /* JADX WARN: Code duplicated, block: B:159:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:176:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:195:0x032f  */
    /* JADX WARN: Code duplicated, block: B:214:0x036e  */
    /* JADX WARN: Code duplicated, block: B:229:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:247:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:262:0x0424  */
    /* JADX WARN: Code duplicated, block: B:284:0x046b  */
    /* JADX WARN: Code duplicated, block: B:304:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:324:0x0507  */
    /* JADX WARN: Code duplicated, block: B:346:0x0549  */
    /* JADX WARN: Code duplicated, block: B:361:0x0581  */
    /* JADX WARN: Code duplicated, block: B:378:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:393:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:408:0x062b  */
    /* JADX WARN: Code duplicated, block: B:425:0x0666  */
    /* JADX WARN: Code duplicated, block: B:442:0x069e  */
    /* JADX WARN: Code duplicated, block: B:457:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:472:0x070e  */
    /* JADX WARN: Code duplicated, block: B:489:0x0746  */
    /* JADX WARN: Code duplicated, block: B:506:0x077e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:78:0x0133  */
    /* JADX WARN: Code duplicated, block: B:93:0x0175  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        h2e0 h2e0Var;
        p3e0 p3e0Var;
        q3e0 q3e0Var;
        r3e0 r3e0Var;
        s3e0 s3e0Var;
        t3e0 t3e0Var;
        x5e0 x5e0Var;
        y5e0 y5e0Var;
        f6e0 f6e0Var;
        i6e0 i6e0Var;
        j6e0 j6e0Var;
        l6e0 l6e0Var;
        cee0 cee0Var;
        dee0 dee0Var;
        tee0 tee0Var;
        wfe0 wfe0Var;
        wse0 wse0Var;
        xse0 xse0Var;
        gye0 gye0Var;
        b0f0 b0f0Var;
        o2f0 o2f0Var;
        z7f0 z7f0Var;
        b8f0 b8f0Var;
        c8f0 c8f0Var;
        d8f0 d8f0Var;
        e8f0 e8f0Var;
        g8f0 g8f0Var;
        i8f0 i8f0Var;
        int iIntValue;
        j8f0 j8f0Var;
        lgf0 lgf0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        Object objValueOf = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof h2e0) {
                    h2e0Var = (h2e0) lnmVar;
                    int i = h2e0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        h2e0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        h2e0Var = new h2e0(this, lnmVar);
                    }
                } else {
                    h2e0Var = new h2e0(this, lnmVar);
                }
                Object obj2 = h2e0Var.a;
                int i2 = h2e0Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                dl50 dl50Var = (dl50) obj;
                if (dl50Var == null) {
                    return rih1Var;
                }
                h2e0Var.b = 1;
                return vr20Var.emit(dl50Var, h2e0Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof p3e0) {
                    p3e0Var = (p3e0) lnmVar;
                    int i3 = p3e0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        p3e0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        p3e0Var = new p3e0(this, lnmVar);
                    }
                } else {
                    p3e0Var = new p3e0(this, lnmVar);
                }
                Object obj3 = p3e0Var.a;
                int i4 = p3e0Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                if (!(obj instanceof i1r)) {
                    return rih1Var;
                }
                p3e0Var.b = 1;
                return vr20Var.emit(obj, p3e0Var) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof q3e0) {
                    q3e0Var = (q3e0) lnmVar;
                    int i5 = q3e0Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        q3e0Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        q3e0Var = new q3e0(this, lnmVar);
                    }
                } else {
                    q3e0Var = new q3e0(this, lnmVar);
                }
                Object obj4 = q3e0Var.a;
                int i6 = q3e0Var.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                if (!(obj instanceof i1r)) {
                    return rih1Var;
                }
                q3e0Var.b = 1;
                return vr20Var.emit(obj, q3e0Var) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof r3e0) {
                    r3e0Var = (r3e0) lnmVar;
                    int i7 = r3e0Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        r3e0Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        r3e0Var = new r3e0(this, lnmVar);
                    }
                } else {
                    r3e0Var = new r3e0(this, lnmVar);
                }
                Object obj5 = r3e0Var.a;
                int i8 = r3e0Var.b;
                if (i8 == 0) {
                    hm5.M(obj5);
                    Object obj6 = ((i1r) obj).a;
                    r3e0Var.b = 1;
                    return vr20Var.emit(obj6, r3e0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i8 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (lnmVar instanceof s3e0) {
                    s3e0Var = (s3e0) lnmVar;
                    int i9 = s3e0Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        s3e0Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        s3e0Var = new s3e0(this, lnmVar);
                    }
                } else {
                    s3e0Var = new s3e0(this, lnmVar);
                }
                Object obj7 = s3e0Var.a;
                int i10 = s3e0Var.b;
                if (i10 == 0) {
                    hm5.M(obj7);
                    Object obj8 = ((i1r) obj).a;
                    s3e0Var.b = 1;
                    return vr20Var.emit(obj8, s3e0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i10 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                if (lnmVar instanceof t3e0) {
                    t3e0Var = (t3e0) lnmVar;
                    int i11 = t3e0Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        t3e0Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        t3e0Var = new t3e0(this, lnmVar);
                    }
                } else {
                    t3e0Var = new t3e0(this, lnmVar);
                }
                Object obj9 = t3e0Var.a;
                int i12 = t3e0Var.b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                jo10 jo10Var = (jo10) obj;
                if (jo10Var == null) {
                    return rih1Var;
                }
                t3e0Var.b = 1;
                return vr20Var.emit(jo10Var, t3e0Var) == d9nVar ? d9nVar : rih1Var;
            case 6:
                if (lnmVar instanceof x5e0) {
                    x5e0Var = (x5e0) lnmVar;
                    int i13 = x5e0Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        x5e0Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        x5e0Var = new x5e0(this, lnmVar);
                    }
                } else {
                    x5e0Var = new x5e0(this, lnmVar);
                }
                Object obj10 = x5e0Var.a;
                int i14 = x5e0Var.b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        hm5.M(obj10);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj10);
                if (!(((xnt) obj) instanceof wnt)) {
                    return rih1Var;
                }
                x5e0Var.b = 1;
                return vr20Var.emit(obj, x5e0Var) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof y5e0) {
                    y5e0Var = (y5e0) lnmVar;
                    int i15 = y5e0Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        y5e0Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        y5e0Var = new y5e0(this, lnmVar);
                    }
                } else {
                    y5e0Var = new y5e0(this, lnmVar);
                }
                Object obj11 = y5e0Var.a;
                int i16 = y5e0Var.b;
                if (i16 == 0) {
                    hm5.M(obj11);
                    k8g1 k8g1Var = ((xnt) obj).a;
                    y5e0Var.b = 1;
                    return vr20Var.emit(k8g1Var, y5e0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i16 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lnmVar instanceof f6e0) {
                    f6e0Var = (f6e0) lnmVar;
                    int i17 = f6e0Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        f6e0Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        f6e0Var = new f6e0(this, lnmVar);
                    }
                } else {
                    f6e0Var = new f6e0(this, lnmVar);
                }
                Object obj12 = f6e0Var.a;
                int i18 = f6e0Var.b;
                if (i18 == 0) {
                    hm5.M(obj12);
                    String str = ((th61) obj).a;
                    f6e0Var.b = 1;
                    return vr20Var.emit(str, f6e0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i18 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof i6e0) {
                    i6e0Var = (i6e0) lnmVar;
                    int i19 = i6e0Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        i6e0Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        i6e0Var = new i6e0(this, lnmVar);
                    }
                } else {
                    i6e0Var = new i6e0(this, lnmVar);
                }
                Object obj13 = i6e0Var.a;
                int i20 = i6e0Var.b;
                if (i20 != 0) {
                    if (i20 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                if (!(obj instanceof i1r)) {
                    return rih1Var;
                }
                i6e0Var.b = 1;
                return vr20Var.emit(obj, i6e0Var) == d9nVar ? d9nVar : rih1Var;
            case 10:
                if (lnmVar instanceof j6e0) {
                    j6e0Var = (j6e0) lnmVar;
                    int i21 = j6e0Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        j6e0Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        j6e0Var = new j6e0(this, lnmVar);
                    }
                } else {
                    j6e0Var = new j6e0(this, lnmVar);
                }
                Object obj14 = j6e0Var.a;
                int i22 = j6e0Var.b;
                if (i22 == 0) {
                    hm5.M(obj14);
                    Object obj15 = ((i1r) obj).a;
                    j6e0Var.b = 1;
                    return vr20Var.emit(obj15, j6e0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i22 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lnmVar instanceof l6e0) {
                    l6e0Var = (l6e0) lnmVar;
                    int i23 = l6e0Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        l6e0Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        l6e0Var = new l6e0(this, lnmVar);
                    }
                } else {
                    l6e0Var = new l6e0(this, lnmVar);
                }
                Object obj16 = l6e0Var.a;
                int i24 = l6e0Var.b;
                if (i24 != 0) {
                    if (i24 == 1) {
                        hm5.M(obj16);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj16);
                zn7 zn7Var = (zn7) obj;
                objValueOf = (zn7Var.b == null && zn7Var.a == null) ? null : zn7Var;
                if (objValueOf == null) {
                    return rih1Var;
                }
                l6e0Var.b = 1;
                return vr20Var.emit(objValueOf, l6e0Var) == d9nVar ? d9nVar : rih1Var;
            case 12:
                if (lnmVar instanceof cee0) {
                    cee0Var = (cee0) lnmVar;
                    int i25 = cee0Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        cee0Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        cee0Var = new cee0(this, lnmVar);
                    }
                } else {
                    cee0Var = new cee0(this, lnmVar);
                }
                Object obj17 = cee0Var.a;
                int i26 = cee0Var.b;
                if (i26 == 0) {
                    hm5.M(obj17);
                    byte[] bArr = (byte[]) obj;
                    try {
                        EsLocalFiles.GetSourcesResponse getSourcesResponseP = EsLocalFiles.GetSourcesResponse.p(bArr);
                        cee0Var.b = 1;
                        return vr20Var.emit(getSourcesResponseP, cee0Var) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e) {
                        bhn0.o(f4i1.f("Unable to parse data as com.spotify.local_files_esperanto.proto.EsLocalFiles.GetSourcesResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i26 == 1) {
                        hm5.M(obj17);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 13:
                if (lnmVar instanceof dee0) {
                    dee0Var = (dee0) lnmVar;
                    int i27 = dee0Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        dee0Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        dee0Var = new dee0(this, lnmVar);
                    }
                } else {
                    dee0Var = new dee0(this, lnmVar);
                }
                Object obj18 = dee0Var.a;
                int i28 = dee0Var.b;
                if (i28 == 0) {
                    hm5.M(obj18);
                    byte[] bArr2 = (byte[]) obj;
                    try {
                        EsLocalFiles.GetTracksResponse getTracksResponseO = EsLocalFiles.GetTracksResponse.o(bArr2);
                        dee0Var.b = 1;
                        return vr20Var.emit(getTracksResponseO, dee0Var) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e2) {
                        bhn0.o(f4i1.f("Unable to parse data as com.spotify.local_files_esperanto.proto.EsLocalFiles.GetTracksResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                    }
                } else {
                    if (i28 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 14:
                if (lnmVar instanceof tee0) {
                    tee0Var = (tee0) lnmVar;
                    int i29 = tee0Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        tee0Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        tee0Var = new tee0(this, lnmVar);
                    }
                } else {
                    tee0Var = new tee0(this, lnmVar);
                }
                Object obj19 = tee0Var.a;
                int i30 = tee0Var.b;
                if (i30 != 0) {
                    if (i30 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                objValueOf = i1rVar2 != null ? (Set) i1rVar2.a : null;
                if (objValueOf == null) {
                    return rih1Var;
                }
                tee0Var.b = 1;
                return vr20Var.emit(objValueOf, tee0Var) == d9nVar ? d9nVar : rih1Var;
            case 15:
                if (lnmVar instanceof wfe0) {
                    wfe0Var = (wfe0) lnmVar;
                    int i31 = wfe0Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        wfe0Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        wfe0Var = new wfe0(this, lnmVar);
                    }
                } else {
                    wfe0Var = new wfe0(this, lnmVar);
                }
                Object obj20 = wfe0Var.a;
                int i32 = wfe0Var.b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        hm5.M(obj20);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj20);
                Boolean bool = (Boolean) obj;
                bool.getClass();
                f790 f790Var = new f790(bool.booleanValue());
                wfe0Var.b = 1;
                return vr20Var.emit(f790Var, wfe0Var) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof wse0) {
                    wse0Var = (wse0) lnmVar;
                    int i33 = wse0Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        wse0Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        wse0Var = new wse0(this, lnmVar);
                    }
                } else {
                    wse0Var = new wse0(this, lnmVar);
                }
                Object obj21 = wse0Var.a;
                int i34 = wse0Var.b;
                if (i34 != 0) {
                    if (i34 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                String str2 = ((qxw) obj).a;
                if (str2 == null) {
                    str2 = "";
                }
                wse0Var.b = 1;
                return vr20Var.emit(str2, wse0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (lnmVar instanceof xse0) {
                    xse0Var = (xse0) lnmVar;
                    int i35 = xse0Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        xse0Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        xse0Var = new xse0(this, lnmVar);
                    }
                } else {
                    xse0Var = new xse0(this, lnmVar);
                }
                Object obj22 = xse0Var.a;
                int i36 = xse0Var.b;
                if (i36 == 0) {
                    hm5.M(obj22);
                    String str3 = ((th61) obj).a;
                    xse0Var.b = 1;
                    return vr20Var.emit(str3, xse0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i36 == 1) {
                    hm5.M(obj22);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof gye0) {
                    gye0Var = (gye0) lnmVar;
                    int i37 = gye0Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        gye0Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        gye0Var = new gye0(this, lnmVar);
                    }
                } else {
                    gye0Var = new gye0(this, lnmVar);
                }
                Object obj23 = gye0Var.a;
                int i38 = gye0Var.b;
                if (i38 == 0) {
                    hm5.M(obj23);
                    if (((eye0) obj) != null) {
                        gye0Var.b = 1;
                        return vr20Var.emit(cye0.a, gye0Var) == d9nVar ? d9nVar : rih1Var;
                    }
                    eg.o();
                } else {
                    if (i38 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof b0f0) {
                    b0f0Var = (b0f0) lnmVar;
                    int i39 = b0f0Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        b0f0Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        b0f0Var = new b0f0(this, lnmVar);
                    }
                } else {
                    b0f0Var = new b0f0(this, lnmVar);
                }
                Object obj24 = b0f0Var.a;
                int i40 = b0f0Var.b;
                if (i40 != 0) {
                    if (i40 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj24);
                jn41 jn41Var = (ln41) obj;
                Object d0f0Var = jn41Var instanceof jn41 ? new d0f0(((ui8) jn41Var.a).d()) : e0f0.a;
                b0f0Var.b = 1;
                return vr20Var.emit(d0f0Var, b0f0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (lnmVar instanceof o2f0) {
                    o2f0Var = (o2f0) lnmVar;
                    int i41 = o2f0Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        o2f0Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        o2f0Var = new o2f0(this, lnmVar);
                    }
                } else {
                    o2f0Var = new o2f0(this, lnmVar);
                }
                Object obj25 = o2f0Var.a;
                int i42 = o2f0Var.b;
                if (i42 != 0) {
                    if (i42 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                if (!((th61) obj).b) {
                    return rih1Var;
                }
                o2f0Var.b = 1;
                return vr20Var.emit(obj, o2f0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (lnmVar instanceof z7f0) {
                    z7f0Var = (z7f0) lnmVar;
                    int i43 = z7f0Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        z7f0Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        z7f0Var = new z7f0(this, lnmVar);
                    }
                } else {
                    z7f0Var = new z7f0(this, lnmVar);
                }
                Object obj26 = z7f0Var.a;
                int i44 = z7f0Var.b;
                if (i44 != 0) {
                    if (i44 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                mmr0 mmr0Var = (mmr0) obj;
                List list = (List) mmr0Var.a;
                Boolean bool2 = (Boolean) mmr0Var.b;
                bool2.getClass();
                mmr0 mmr0Var2 = new mmr0(pbq.l(list), bool2);
                z7f0Var.b = 1;
                return vr20Var.emit(mmr0Var2, z7f0Var) == d9nVar ? d9nVar : rih1Var;
            case 22:
                if (lnmVar instanceof b8f0) {
                    b8f0Var = (b8f0) lnmVar;
                    int i45 = b8f0Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        b8f0Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        b8f0Var = new b8f0(this, lnmVar);
                    }
                } else {
                    b8f0Var = new b8f0(this, lnmVar);
                }
                Object obj27 = b8f0Var.a;
                int i46 = b8f0Var.b;
                if (i46 == 0) {
                    hm5.M(obj27);
                    Boolean boolValueOf = Boolean.valueOf(!u890.j((Boolean) obj, Boolean.FALSE));
                    b8f0Var.b = 1;
                    return vr20Var.emit(boolValueOf, b8f0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i46 == 1) {
                    hm5.M(obj27);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                if (lnmVar instanceof c8f0) {
                    c8f0Var = (c8f0) lnmVar;
                    int i47 = c8f0Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        c8f0Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        c8f0Var = new c8f0(this, lnmVar);
                    }
                } else {
                    c8f0Var = new c8f0(this, lnmVar);
                }
                Object obj28 = c8f0Var.a;
                int i48 = c8f0Var.b;
                if (i48 != 0) {
                    if (i48 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                mmr0 mmr0Var3 = (mmr0) obj;
                List list2 = (List) mmr0Var3.a;
                Boolean bool3 = (Boolean) mmr0Var3.b;
                bool3.getClass();
                l0l l0lVarL = pbq.l(list2);
                ArrayList arrayList = new ArrayList();
                for (Object obj29 : list2) {
                    if (((l0l) obj29) != l0lVarL) {
                        arrayList.add(obj29);
                    }
                }
                mmr0 mmr0Var4 = new mmr0(arrayList, bool3);
                c8f0Var.b = 1;
                return vr20Var.emit(mmr0Var4, c8f0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (lnmVar instanceof d8f0) {
                    d8f0Var = (d8f0) lnmVar;
                    int i49 = d8f0Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        d8f0Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        d8f0Var = new d8f0(this, lnmVar);
                    }
                } else {
                    d8f0Var = new d8f0(this, lnmVar);
                }
                Object obj30 = d8f0Var.a;
                int i50 = d8f0Var.b;
                if (i50 == 0) {
                    hm5.M(obj30);
                    Boolean boolValueOf2 = Boolean.valueOf(u890.j((Boolean) obj, Boolean.TRUE));
                    d8f0Var.b = 1;
                    return vr20Var.emit(boolValueOf2, d8f0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i50 == 1) {
                    hm5.M(obj30);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (lnmVar instanceof e8f0) {
                    e8f0Var = (e8f0) lnmVar;
                    int i51 = e8f0Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        e8f0Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        e8f0Var = new e8f0(this, lnmVar);
                    }
                } else {
                    e8f0Var = new e8f0(this, lnmVar);
                }
                Object obj31 = e8f0Var.a;
                int i52 = e8f0Var.b;
                if (i52 == 0) {
                    hm5.M(obj31);
                    Boolean boolValueOf3 = Boolean.valueOf(rwq.k(((Number) obj).intValue()));
                    e8f0Var.b = 1;
                    return vr20Var.emit(boolValueOf3, e8f0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i52 == 1) {
                    hm5.M(obj31);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lnmVar instanceof g8f0) {
                    g8f0Var = (g8f0) lnmVar;
                    int i53 = g8f0Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        g8f0Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        g8f0Var = new g8f0(this, lnmVar);
                    }
                } else {
                    g8f0Var = new g8f0(this, lnmVar);
                }
                Object obj32 = g8f0Var.a;
                int i54 = g8f0Var.b;
                if (i54 == 0) {
                    hm5.M(obj32);
                    Boolean boolValueOf4 = Boolean.valueOf(rwq.k(((Number) obj).intValue()));
                    g8f0Var.b = 1;
                    return vr20Var.emit(boolValueOf4, g8f0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i54 == 1) {
                    hm5.M(obj32);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                if (lnmVar instanceof i8f0) {
                    i8f0Var = (i8f0) lnmVar;
                    int i55 = i8f0Var.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        i8f0Var.b = i55 - Integer.MIN_VALUE;
                    } else {
                        i8f0Var = new i8f0(this, lnmVar);
                    }
                } else {
                    i8f0Var = new i8f0(this, lnmVar);
                }
                Object obj33 = i8f0Var.a;
                int i56 = i8f0Var.b;
                if (i56 != 0) {
                    if (i56 == 1) {
                        hm5.M(obj33);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj33);
                Object obj34 = ((e331) obj).a;
                if (obj34 instanceof m231) {
                    obj34 = null;
                }
                Integer num = (Integer) obj34;
                if (num != null && (iIntValue = num.intValue()) != 0) {
                    objValueOf = Boolean.valueOf(rwq.k(iIntValue));
                }
                i8f0Var.b = 1;
                return vr20Var.emit(objValueOf, i8f0Var) == d9nVar ? d9nVar : rih1Var;
            case 28:
                if (lnmVar instanceof j8f0) {
                    j8f0Var = (j8f0) lnmVar;
                    int i57 = j8f0Var.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        j8f0Var.b = i57 - Integer.MIN_VALUE;
                    } else {
                        j8f0Var = new j8f0(this, lnmVar);
                    }
                } else {
                    j8f0Var = new j8f0(this, lnmVar);
                }
                Object obj35 = j8f0Var.a;
                int i58 = j8f0Var.b;
                if (i58 == 0) {
                    hm5.M(obj35);
                    Boolean boolValueOf5 = Boolean.valueOf(rwq.k(((Number) obj).intValue()));
                    j8f0Var.b = 1;
                    return vr20Var.emit(boolValueOf5, j8f0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i58 == 1) {
                    hm5.M(obj35);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof lgf0) {
                    lgf0Var = (lgf0) lnmVar;
                    int i59 = lgf0Var.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        lgf0Var.b = i59 - Integer.MIN_VALUE;
                    } else {
                        lgf0Var = new lgf0(this, lnmVar);
                    }
                } else {
                    lgf0Var = new lgf0(this, lnmVar);
                }
                Object obj36 = lgf0Var.a;
                int i60 = lgf0Var.b;
                if (i60 == 0) {
                    hm5.M(obj36);
                    ggf0 ggf0Var = new ggf0((cay) obj);
                    lgf0Var.b = 1;
                    return vr20Var.emit(ggf0Var, lgf0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i60 == 1) {
                    hm5.M(obj36);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ i2e0(vr20 vr20Var, pbq pbqVar, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
