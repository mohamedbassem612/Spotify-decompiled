package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.player.model.PlayerError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spotify.restrictions.permissions.permissions_proto.PermissionsEsperanto;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nz7 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public nz7(vr20 vr20Var, zo8 zo8Var) {
        this.a = (byte) 27;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01af  */
    /* JADX WARN: Code duplicated, block: B:132:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:151:0x0235  */
    /* JADX WARN: Code duplicated, block: B:173:0x027c  */
    /* JADX WARN: Code duplicated, block: B:188:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:203:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:220:0x0333  */
    /* JADX WARN: Code duplicated, block: B:237:0x0374  */
    /* JADX WARN: Code duplicated, block: B:252:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:267:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:282:0x0436  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:297:0x0475  */
    /* JADX WARN: Code duplicated, block: B:323:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:338:0x0504  */
    /* JADX WARN: Code duplicated, block: B:353:0x0544  */
    /* JADX WARN: Code duplicated, block: B:368:0x0583  */
    /* JADX WARN: Code duplicated, block: B:383:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:398:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:413:0x063a  */
    /* JADX WARN: Code duplicated, block: B:428:0x0686  */
    /* JADX WARN: Code duplicated, block: B:457:0x06df  */
    /* JADX WARN: Code duplicated, block: B:474:0x071c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:489:0x075f  */
    /* JADX WARN: Code duplicated, block: B:506:0x0797  */
    /* JADX WARN: Code duplicated, block: B:521:0x07d2  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:78:0x0128  */
    /* JADX WARN: Code duplicated, block: B:97:0x0177  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    public final Object emit(Object obj, lnm lnmVar) {
        mz7 mz7Var;
        Object obj2;
        tc8 tc8Var;
        yi8 yi8Var;
        hu8 hu8Var;
        xu8 xu8Var;
        qv8 qv8Var;
        wv8 wv8Var;
        xv8 xv8Var;
        e89 e89Var;
        w89 w89Var;
        pa9 pa9Var;
        ua9 ua9Var;
        cb9 cb9Var;
        nd9 nd9Var;
        gd9 gd9Var;
        od9 od9Var;
        pd9 pd9Var;
        ud9 ud9Var;
        vd9 vd9Var;
        wd9 wd9Var;
        xd9 xd9Var;
        yj9 yj9Var;
        zj9 zj9Var;
        dl9 dl9Var;
        pm9 pm9Var;
        mp9 mp9Var;
        cq9 cq9Var;
        dq9 dq9Var;
        rq9 rq9Var;
        mmr0 mmr0Var;
        String str;
        hr9 hr9Var;
        jr9 jr9Var;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof mz7) {
                    mz7Var = (mz7) lnmVar;
                    int i = mz7Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        mz7Var.b = i - Integer.MIN_VALUE;
                    } else {
                        mz7Var = new mz7(this, lnmVar);
                    }
                } else {
                    mz7Var = new mz7(this, lnmVar);
                }
                Object obj3 = mz7Var.a;
                int i2 = mz7Var.b;
                if (i2 == 0) {
                    hm5.M(obj3);
                    int iOrdinal = ((dv7) obj).ordinal();
                    if (iOrdinal == 0) {
                        obj2 = gz7.a;
                    } else if (iOrdinal == 1) {
                        obj2 = hz7.a;
                    } else {
                        eg.o();
                    }
                    mz7Var.b = 1;
                    return vr20Var.emit(obj2, mz7Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof tc8) {
                    tc8Var = (tc8) lnmVar;
                    int i3 = tc8Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        tc8Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        tc8Var = new tc8(this, lnmVar);
                    }
                } else {
                    tc8Var = new tc8(this, lnmVar);
                }
                Object obj4 = tc8Var.a;
                int i4 = tc8Var.b;
                if (i4 == 0) {
                    hm5.M(obj4);
                    hj50 hj50Var = new hj50((List) obj, (ioj0) null);
                    tc8Var.b = 1;
                    return vr20Var.emit(hj50Var, tc8Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lnmVar instanceof yi8) {
                    yi8Var = (yi8) lnmVar;
                    int i5 = yi8Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        yi8Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        yi8Var = new yi8(this, lnmVar);
                    }
                } else {
                    yi8Var = new yi8(this, lnmVar);
                }
                Object obj5 = yi8Var.a;
                int i6 = yi8Var.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                if (!(obj instanceof dh61)) {
                    return rih1Var;
                }
                yi8Var.b = 1;
                return vr20Var.emit(obj, yi8Var) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof hu8) {
                    hu8Var = (hu8) lnmVar;
                    int i7 = hu8Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        hu8Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        hu8Var = new hu8(this, lnmVar);
                    }
                } else {
                    hu8Var = new hu8(this, lnmVar);
                }
                Object obj6 = hu8Var.a;
                int i8 = hu8Var.b;
                if (i8 == 0) {
                    hm5.M(obj6);
                    Boolean boolValueOf = Boolean.valueOf(!((YourLibraryResponse) obj).n().isEmpty());
                    hu8Var.b = 1;
                    return vr20Var.emit(boolValueOf, hu8Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i8 == 1) {
                    hm5.M(obj6);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (lnmVar instanceof xu8) {
                    xu8Var = (xu8) lnmVar;
                    int i9 = xu8Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        xu8Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        xu8Var = new xu8(this, lnmVar);
                    }
                } else {
                    xu8Var = new xu8(this, lnmVar);
                }
                Object obj7 = xu8Var.a;
                int i10 = xu8Var.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                if (!((uv00) obj).c()) {
                    return rih1Var;
                }
                xu8Var.b = 1;
                return vr20Var.emit(obj, xu8Var) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof qv8) {
                    qv8Var = (qv8) lnmVar;
                    int i11 = qv8Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        qv8Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        qv8Var = new qv8(this, lnmVar);
                    }
                } else {
                    qv8Var = new qv8(this, lnmVar);
                }
                Object obj8 = qv8Var.a;
                int i12 = qv8Var.b;
                if (i12 == 0) {
                    hm5.M(obj8);
                    i1r i1rVar = (k1r) obj;
                    if (i1rVar instanceof i1r) {
                        Object obj9 = i1rVar.a;
                        qv8Var.b = 1;
                        if (vr20Var.emit(obj9, qv8Var) != d9nVar) {
                            return rih1Var;
                        }
                    } else if (i1rVar instanceof h1r) {
                        qv8Var.b = 2;
                        if (vr20Var.emit((Object) null, qv8Var) != d9nVar) {
                            return rih1Var;
                        }
                    } else {
                        if (i1rVar instanceof j1r) {
                            return rih1Var;
                        }
                        eg.o();
                    }
                    return d9nVar;
                }
                if (i12 == 1 || i12 == 2) {
                    hm5.M(obj8);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof wv8) {
                    wv8Var = (wv8) lnmVar;
                    int i13 = wv8Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        wv8Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        wv8Var = new wv8(this, lnmVar);
                    }
                } else {
                    wv8Var = new wv8(this, lnmVar);
                }
                Object obj10 = wv8Var.a;
                int i14 = wv8Var.b;
                if (i14 == 0) {
                    hm5.M(obj10);
                    Boolean boolValueOf2 = Boolean.valueOf(eqr0.s(((cxc0) obj).k, (dlc0[]) Arrays.copyOf(new dlc0[]{dlc0.d}, 1)));
                    wv8Var.b = 1;
                    return vr20Var.emit(boolValueOf2, wv8Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i14 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof xv8) {
                    xv8Var = (xv8) lnmVar;
                    int i15 = xv8Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        xv8Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        xv8Var = new xv8(this, lnmVar);
                    }
                } else {
                    xv8Var = new xv8(this, lnmVar);
                }
                Object obj11 = xv8Var.a;
                int i16 = xv8Var.b;
                if (i16 == 0) {
                    hm5.M(obj11);
                    Boolean boolValueOf3 = Boolean.valueOf(((cw8) obj).a);
                    xv8Var.b = 1;
                    return vr20Var.emit(boolValueOf3, xv8Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i16 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lnmVar instanceof e89) {
                    e89Var = (e89) lnmVar;
                    int i17 = e89Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        e89Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        e89Var = new e89(this, lnmVar);
                    }
                } else {
                    e89Var = new e89(this, lnmVar);
                }
                Object obj12 = e89Var.a;
                int i18 = e89Var.b;
                if (i18 == 0) {
                    hm5.M(obj12);
                    Boolean boolValueOf4 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    e89Var.b = 1;
                    return vr20Var.emit(boolValueOf4, e89Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i18 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof w89) {
                    w89Var = (w89) lnmVar;
                    int i19 = w89Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        w89Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        w89Var = new w89(this, lnmVar);
                    }
                } else {
                    w89Var = new w89(this, lnmVar);
                }
                Object obj13 = w89Var.a;
                int i20 = w89Var.b;
                if (i20 == 0) {
                    hm5.M(obj13);
                    Boolean boolValueOf5 = Boolean.valueOf(((bp90) obj).d);
                    w89Var.b = 1;
                    return vr20Var.emit(boolValueOf5, w89Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i20 == 1) {
                    hm5.M(obj13);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof pa9) {
                    pa9Var = (pa9) lnmVar;
                    int i21 = pa9Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        pa9Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        pa9Var = new pa9(this, lnmVar);
                    }
                } else {
                    pa9Var = new pa9(this, lnmVar);
                }
                Object obj14 = pa9Var.a;
                int i22 = pa9Var.b;
                if (i22 == 0) {
                    hm5.M(obj14);
                    Boolean boolValueOf6 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    pa9Var.b = 1;
                    return vr20Var.emit(boolValueOf6, pa9Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i22 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lnmVar instanceof ua9) {
                    ua9Var = (ua9) lnmVar;
                    int i23 = ua9Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        ua9Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        ua9Var = new ua9(this, lnmVar);
                    }
                } else {
                    ua9Var = new ua9(this, lnmVar);
                }
                Object obj15 = ua9Var.a;
                int i24 = ua9Var.b;
                if (i24 == 0) {
                    hm5.M(obj15);
                    Boolean boolValueOf7 = Boolean.valueOf(u890.j((String) obj, "1"));
                    ua9Var.b = 1;
                    return vr20Var.emit(boolValueOf7, ua9Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i24 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof cb9) {
                    cb9Var = (cb9) lnmVar;
                    int i25 = cb9Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        cb9Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        cb9Var = new cb9(this, lnmVar);
                    }
                } else {
                    cb9Var = new cb9(this, lnmVar);
                }
                Object obj16 = cb9Var.a;
                int i26 = cb9Var.b;
                if (i26 == 0) {
                    hm5.M(obj16);
                    d0o0 d0o0Var = new d0o0((Set) obj);
                    cb9Var.b = 1;
                    return vr20Var.emit(d0o0Var, cb9Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i26 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof nd9) {
                    nd9Var = (nd9) lnmVar;
                    int i27 = nd9Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        nd9Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        nd9Var = new nd9(this, lnmVar);
                    }
                } else {
                    nd9Var = new nd9(this, lnmVar);
                }
                Object obj17 = nd9Var.a;
                int i28 = nd9Var.b;
                if (i28 == 0) {
                    hm5.M(obj17);
                    eib eibVar = (eib) obj;
                    if (u890.j(eibVar, bib.a)) {
                        gd9Var = gd9.a;
                    } else if ((eibVar instanceof cib) || u890.j(eibVar, dib.a)) {
                        gd9Var = hd9.a;
                    } else {
                        eg.o();
                    }
                    nd9Var.b = 1;
                    return vr20Var.emit(gd9Var, nd9Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i28 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof od9) {
                    od9Var = (od9) lnmVar;
                    int i29 = od9Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        od9Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        od9Var = new od9(this, lnmVar);
                    }
                } else {
                    od9Var = new od9(this, lnmVar);
                }
                Object obj18 = od9Var.a;
                int i30 = od9Var.b;
                if (i30 != 0) {
                    if (i30 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                zd9 zd9Var = (zd9) obj;
                id9 id9Var = new id9(zd9Var.a, zd9Var.b);
                od9Var.b = 1;
                return vr20Var.emit(id9Var, od9Var) == d9nVar ? d9nVar : rih1Var;
            case 15:
                if (lnmVar instanceof pd9) {
                    pd9Var = (pd9) lnmVar;
                    int i31 = pd9Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        pd9Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        pd9Var = new pd9(this, lnmVar);
                    }
                } else {
                    pd9Var = new pd9(this, lnmVar);
                }
                Object obj19 = pd9Var.a;
                int i32 = pd9Var.b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                fib fibVar = (fib) obj;
                jd9 jd9Var = new jd9(fibVar.a, fibVar.b, fibVar.c, fibVar.d);
                pd9Var.b = 1;
                return vr20Var.emit(jd9Var, pd9Var) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof ud9) {
                    ud9Var = (ud9) lnmVar;
                    int i33 = ud9Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        ud9Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        ud9Var = new ud9(this, lnmVar);
                    }
                } else {
                    ud9Var = new ud9(this, lnmVar);
                }
                Object obj20 = ud9Var.a;
                int i34 = ud9Var.b;
                if (i34 == 0) {
                    hm5.M(obj20);
                    Boolean boolValueOf8 = Boolean.valueOf(((Set) obj).contains(jne.a));
                    ud9Var.b = 1;
                    return vr20Var.emit(boolValueOf8, ud9Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i34 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                if (lnmVar instanceof vd9) {
                    vd9Var = (vd9) lnmVar;
                    int i35 = vd9Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        vd9Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        vd9Var = new vd9(this, lnmVar);
                    }
                } else {
                    vd9Var = new vd9(this, lnmVar);
                }
                Object obj21 = vd9Var.a;
                int i36 = vd9Var.b;
                if (i36 == 0) {
                    hm5.M(obj21);
                    acu acuVar = new acu(((Boolean) obj).booleanValue());
                    vd9Var.b = 1;
                    return vr20Var.emit(acuVar, vd9Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i36 == 1) {
                    hm5.M(obj21);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof wd9) {
                    wd9Var = (wd9) lnmVar;
                    int i37 = wd9Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        wd9Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        wd9Var = new wd9(this, lnmVar);
                    }
                } else {
                    wd9Var = new wd9(this, lnmVar);
                }
                Object obj22 = wd9Var.a;
                int i38 = wd9Var.b;
                if (i38 != 0) {
                    if (i38 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                if (!((ge9) obj).b.equals(jne.a)) {
                    return rih1Var;
                }
                wd9Var.b = 1;
                return vr20Var.emit(obj, wd9Var) == d9nVar ? d9nVar : rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof xd9) {
                    xd9Var = (xd9) lnmVar;
                    int i39 = xd9Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        xd9Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        xd9Var = new xd9(this, lnmVar);
                    }
                } else {
                    xd9Var = new xd9(this, lnmVar);
                }
                Object obj23 = xd9Var.a;
                int i40 = xd9Var.b;
                if (i40 != 0) {
                    if (i40 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                if (!(obj instanceof ge9)) {
                    return rih1Var;
                }
                xd9Var.b = 1;
                return vr20Var.emit(obj, xd9Var) == d9nVar ? d9nVar : rih1Var;
            case 20:
                if (lnmVar instanceof yj9) {
                    yj9Var = (yj9) lnmVar;
                    int i41 = yj9Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        yj9Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        yj9Var = new yj9(this, lnmVar);
                    }
                } else {
                    yj9Var = new yj9(this, lnmVar);
                }
                Object obj24 = yj9Var.a;
                int i42 = yj9Var.b;
                if (i42 == 0) {
                    hm5.M(obj24);
                    Boolean boolValueOf9 = Boolean.valueOf(((Set) obj).contains(jne.a));
                    yj9Var.b = 1;
                    return vr20Var.emit(boolValueOf9, yj9Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i42 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 21:
                if (lnmVar instanceof zj9) {
                    zj9Var = (zj9) lnmVar;
                    int i43 = zj9Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        zj9Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        zj9Var = new zj9(this, lnmVar);
                    }
                } else {
                    zj9Var = new zj9(this, lnmVar);
                }
                Object obj25 = zj9Var.a;
                int i44 = zj9Var.b;
                if (i44 == 0) {
                    hm5.M(obj25);
                    fdu fduVar = new fdu(((Boolean) obj).booleanValue());
                    zj9Var.b = 1;
                    return vr20Var.emit(fduVar, zj9Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i44 == 1) {
                    hm5.M(obj25);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof dl9) {
                    dl9Var = (dl9) lnmVar;
                    int i45 = dl9Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        dl9Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        dl9Var = new dl9(this, lnmVar);
                    }
                } else {
                    dl9Var = new dl9(this, lnmVar);
                }
                Object obj26 = dl9Var.a;
                int i46 = dl9Var.b;
                if (i46 != 0) {
                    if (i46 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                i1r i1rVar2 = (k1r) obj;
                i1r i1rVar3 = i1rVar2 instanceof i1r ? i1rVar2 : null;
                xq9 xq9Var = i1rVar3 != null ? (xq9) i1rVar3.a : null;
                if (xq9Var == null) {
                    return rih1Var;
                }
                dl9Var.b = 1;
                return vr20Var.emit(xq9Var, dl9Var) == d9nVar ? d9nVar : rih1Var;
            case 23:
                if (lnmVar instanceof pm9) {
                    pm9Var = (pm9) lnmVar;
                    int i47 = pm9Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        pm9Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        pm9Var = new pm9(this, lnmVar);
                    }
                } else {
                    pm9Var = new pm9(this, lnmVar);
                }
                Object obj27 = pm9Var.a;
                int i48 = pm9Var.b;
                if (i48 != 0) {
                    if (i48 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                th61 th61Var = (th61) obj;
                int i49 = sm9.b;
                if (!th61Var.d && th61Var.b) {
                    return rih1Var;
                }
                pm9Var.b = 1;
                return vr20Var.emit(obj, pm9Var) == d9nVar ? d9nVar : rih1Var;
            case 24:
                if (lnmVar instanceof mp9) {
                    mp9Var = (mp9) lnmVar;
                    int i50 = mp9Var.b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        mp9Var.b = i50 - Integer.MIN_VALUE;
                    } else {
                        mp9Var = new mp9(this, lnmVar);
                    }
                } else {
                    mp9Var = new mp9(this, lnmVar);
                }
                Object obj28 = mp9Var.a;
                int i51 = mp9Var.b;
                if (i51 != 0) {
                    if (i51 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                lp9 lp9Var = (lp9) obj;
                if ((lp9Var instanceof jp9) && ((jp9) lp9Var).c == 1) {
                    z = true;
                }
                Boolean boolValueOf10 = Boolean.valueOf(z);
                mp9Var.b = 1;
                return vr20Var.emit(boolValueOf10, mp9Var) == d9nVar ? d9nVar : rih1Var;
            case 25:
                if (lnmVar instanceof cq9) {
                    cq9Var = (cq9) lnmVar;
                    int i52 = cq9Var.b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        cq9Var.b = i52 - Integer.MIN_VALUE;
                    } else {
                        cq9Var = new cq9(this, lnmVar);
                    }
                } else {
                    cq9Var = new cq9(this, lnmVar);
                }
                Object obj29 = cq9Var.a;
                int i53 = cq9Var.b;
                if (i53 == 0) {
                    hm5.M(obj29);
                    cq9Var.b = 1;
                    return vr20Var.emit(sp9.a, cq9Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i53 == 1) {
                    hm5.M(obj29);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lnmVar instanceof dq9) {
                    dq9Var = (dq9) lnmVar;
                    int i54 = dq9Var.b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        dq9Var.b = i54 - Integer.MIN_VALUE;
                    } else {
                        dq9Var = new dq9(this, lnmVar);
                    }
                } else {
                    dq9Var = new dq9(this, lnmVar);
                }
                Object obj30 = dq9Var.a;
                int i55 = dq9Var.b;
                if (i55 != 0) {
                    if (i55 == 1) {
                        hm5.M(obj30);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj30);
                PlayerError playerError = (PlayerError) obj;
                if (!fq9.b.contains(playerError.error()) || !ihc1.h0(playerError.reasons(), "byom_restriction_filtered", false)) {
                    return rih1Var;
                }
                dq9Var.b = 1;
                return vr20Var.emit(obj, dq9Var) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof rq9) {
                    rq9Var = (rq9) lnmVar;
                    int i56 = rq9Var.b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        rq9Var.b = i56 - Integer.MIN_VALUE;
                    } else {
                        rq9Var = new rq9(this, lnmVar);
                    }
                } else {
                    rq9Var = new rq9(this, lnmVar);
                }
                Object obj31 = rq9Var.a;
                int i57 = rq9Var.b;
                if (i57 != 0) {
                    if (i57 == 1) {
                        hm5.M(obj31);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj31);
                uv00 uv00Var = (uv00) obj;
                uv00Var.getClass();
                List<tv00> listB = uv00Var.b(jo70.class);
                ArrayList arrayList = new ArrayList();
                for (tv00 tv00Var : listB) {
                    jo70 jo70Var = tv00Var.b;
                    if (jo70Var == null || (str = jo70Var.a) == null) {
                        mmr0Var = null;
                    } else {
                        if (str.length() <= 0) {
                            str = null;
                        }
                        if (str != null) {
                            mmr0Var = new mmr0(tv00Var.a, str);
                        } else {
                            mmr0Var = null;
                        }
                    }
                    if (mmr0Var != null) {
                        arrayList.add(mmr0Var);
                    }
                }
                Map mapT = sqg0.T(arrayList);
                rq9Var.b = 1;
                return vr20Var.emit(mapT, rq9Var) == d9nVar ? d9nVar : rih1Var;
            case 28:
                if (lnmVar instanceof hr9) {
                    hr9Var = (hr9) lnmVar;
                    int i58 = hr9Var.b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        hr9Var.b = i58 - Integer.MIN_VALUE;
                    } else {
                        hr9Var = new hr9(this, lnmVar);
                    }
                } else {
                    hr9Var = new hr9(this, lnmVar);
                }
                Object obj32 = hr9Var.a;
                int i59 = hr9Var.b;
                if (i59 != 0) {
                    if (i59 == 1) {
                        hm5.M(obj32);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj32);
                PermissionsEsperanto.BYOMRestrictionState bYOMRestrictionState = (PermissionsEsperanto.BYOMRestrictionState) obj;
                if (bYOMRestrictionState.n() || bYOMRestrictionState.o() == tns0.c) {
                    return rih1Var;
                }
                hr9Var.b = 1;
                return vr20Var.emit(obj, hr9Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof jr9) {
                    jr9Var = (jr9) lnmVar;
                    int i60 = jr9Var.b;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        jr9Var.b = i60 - Integer.MIN_VALUE;
                    } else {
                        jr9Var = new jr9(this, lnmVar);
                    }
                } else {
                    jr9Var = new jr9(this, lnmVar);
                }
                Object obj33 = jr9Var.a;
                int i61 = jr9Var.b;
                if (i61 == 0) {
                    hm5.M(obj33);
                    cr9 cr9Var = ((PermissionsEsperanto.BYOMRestrictionState) obj).o() == tns0.d ? cr9.a : cr9.b;
                    jr9Var.b = 1;
                    return vr20Var.emit(cr9Var, jr9Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i61 == 1) {
                    hm5.M(obj33);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ nz7(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
