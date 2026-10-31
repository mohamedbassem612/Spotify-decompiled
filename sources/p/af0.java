package p;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.ageverification.ageassurancewebview.AgeAssuranceWebViewActivity;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class af0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public /* synthetic */ Object d;
    public Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af0(jnq jnqVar, List list, String str, String str2, tv80 tv80Var, gy1 gy1Var, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 9;
        this.e = jnqVar;
        this.f = list;
        this.c = str;
        this.d = str2;
        this.g = tv80Var;
        this.h = gy1Var;
        this.b = z;
    }

    private final Object e(Object obj) {
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            ve01 ve01Var = ((gc01) this.e).d;
            d9l d9lVar = new d9l((ed01) this.d, (String) this.c, (ven0) this.f, (hdn0) this.g, (hdn0) this.h, (byte) 7);
            this.b = true;
            Object objCollect = ve01Var.a.collect(d9lVar, this);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        jah.d();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:58:? A[SYNTHETIC] */
    private final Object g(Object obj) throws Throwable {
        p811 p811Var;
        Throwable th;
        p811 p811Var2;
        k8c0 k8c0Var;
        k8c0 k8c0Var2;
        k8c0 k8c0Var3;
        Object objR;
        d9n d9nVar;
        faa0 faa0Var;
        aac0 aac0Var;
        faa0 faa0Var2;
        aac0 aac0Var2;
        x8c0 x8c0Var = (x8c0) this.d;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        if (!z) {
            hm5.M(obj);
            if (x8c0Var.b() != w8c0.a) {
                p811 p811Var3 = new p811();
                p811 p811Var4 = new p811();
                try {
                    w8c0 w8c0Var = (w8c0) this.f;
                    c9n c9nVar = (c9n) this.g;
                    vu30 vu30Var = (vu30) this.h;
                    this.e = p811Var3;
                    this.c = p811Var4;
                    this.b = true;
                    ohd ohdVar = new ohd(1, aym.t(this));
                    ohdVar.t();
                    k8c0.Companion.getClass();
                    int iOrdinal = w8c0Var.ordinal();
                    if (iOrdinal == 2) {
                        k8c0Var = k8c0.ON_CREATE;
                    } else if (iOrdinal != 3) {
                        k8c0Var = iOrdinal != 4 ? null : k8c0.ON_RESUME;
                    } else {
                        k8c0Var = k8c0.ON_START;
                    }
                    int iOrdinal2 = w8c0Var.ordinal();
                    if (iOrdinal2 == 2) {
                        k8c0Var2 = k8c0.ON_DESTROY;
                    } else if (iOrdinal2 != 3) {
                        if (iOrdinal2 != 4) {
                            k8c0Var3 = null;
                        } else {
                            k8c0Var2 = k8c0.ON_PAUSE;
                        }
                        af21 af21Var = new af21(k8c0Var, p811Var3, c9nVar, k8c0Var3, ohdVar, ygn0.a(), vu30Var);
                        p811Var4.a = af21Var;
                        x8c0Var.a(af21Var);
                        objR = ohdVar.r();
                        d9nVar = d9n.a;
                        if (objR == d9nVar) {
                            return d9nVar;
                        }
                        p811Var = p811Var4;
                        p811Var2 = p811Var3;
                        faa0Var2 = (faa0) p811Var2.a;
                        if (faa0Var2 != null) {
                            faa0Var2.d((CancellationException) null);
                        }
                        aac0Var2 = (aac0) p811Var.a;
                        if (aac0Var2 != null) {
                            x8c0Var.d(aac0Var2);
                        }
                    } else {
                        k8c0Var2 = k8c0.ON_STOP;
                    }
                    k8c0Var3 = k8c0Var2;
                    af21 af21Var2 = new af21(k8c0Var, p811Var3, c9nVar, k8c0Var3, ohdVar, ygn0.a(), vu30Var);
                    p811Var4.a = af21Var2;
                    x8c0Var.a(af21Var2);
                    objR = ohdVar.r();
                    d9nVar = d9n.a;
                    if (objR == d9nVar) {
                        return d9nVar;
                    }
                    p811Var = p811Var4;
                    p811Var2 = p811Var3;
                    faa0Var2 = (faa0) p811Var2.a;
                    if (faa0Var2 != null) {
                        faa0Var2.d((CancellationException) null);
                    }
                    aac0Var2 = (aac0) p811Var.a;
                    if (aac0Var2 != null) {
                        x8c0Var.d(aac0Var2);
                    }
                } catch (Throwable th2) {
                    p811Var = p811Var4;
                    th = th2;
                    p811Var2 = p811Var3;
                    faa0Var = (faa0) p811Var2.a;
                    if (faa0Var != null) {
                        faa0Var.d((CancellationException) null);
                    }
                    aac0Var = (aac0) p811Var.a;
                    if (aac0Var != null) {
                        throw th;
                    }
                    x8c0Var.d(aac0Var);
                    throw th;
                }
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p811Var = (p811) this.c;
            p811Var2 = (p811) this.e;
            try {
                hm5.M(obj);
                faa0Var2 = (faa0) p811Var2.a;
                if (faa0Var2 != null) {
                    faa0Var2.d((CancellationException) null);
                }
                aac0Var2 = (aac0) p811Var.a;
                if (aac0Var2 != null) {
                    x8c0Var.d(aac0Var2);
                }
            } catch (Throwable th3) {
                th = th3;
                faa0Var = (faa0) p811Var2.a;
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                aac0Var = (aac0) p811Var.a;
                if (aac0Var != null) {
                    throw th;
                }
                x8c0Var.d(aac0Var);
                throw th;
            }
        }
        return rih1Var;
    }

    private final Object h(Object obj) {
        List list = (List) this.e;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            int size = list.size();
            ne neVar = (ne) this.g;
            if (size == 1) {
                nm21 nm21Var = (nm21) o7h.q0(list);
                tv80 tv80Var = (tv80) this.h;
                this.b = true;
                Object objI = neVar.I(nm21Var, tv80Var, this);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                String str = (String) this.c;
                String str2 = (String) this.d;
                String str3 = (String) this.f;
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().encodedPath("spotify:internal:contribution-notes-report:picker").appendQueryParameter("context_uri", str).appendQueryParameter("item_uri", str2);
                if (str3 != null) {
                    builderAppendQueryParameter.appendQueryParameter("list_item_id", str3);
                }
                a1r0.j((a1r0) neVar.c, builderAppendQueryParameter.build().toString(), (String) null, (Bundle) null, false, 14);
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    private final Object i(Object obj) {
        ega1 ega1Var;
        ya31 ya31Var = (ya31) this.f;
        c9n c9nVar = (c9n) this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            s2t s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new ic01((x390) this.h, (lnm) null, (byte) 15), 3);
            ega1 ega1VarB = ya31Var.a.length() > 0 ? ((ccq) this.g).a(ya31Var.a).b((String) this.c) : new ega1((dga1) null, (l620) null, 7);
            this.d = null;
            this.e = ega1VarB;
            this.b = true;
            obj = s2tVarQ.Q(this);
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
            ega1Var = ega1VarB;
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ega1Var = (ega1) this.e;
            hm5.M(obj);
        }
        cga1 cga1Var = (cga1) obj;
        return new fb31(ega1.a(ega1Var, cga1Var != null ? cga1Var : ega1Var.a, (l620) null, cga1Var, 2));
    }

    private final Object j(Object obj) {
        c9n c9nVar = (c9n) this.e;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            m441 m441VarQ = rwq.q(new zqe((ven0) this.c, (ven0) this.d, (byte) 12));
            xu41 xu41Var = new xu41(c9nVar, (yqg) this.f, (drr0) this.g, (ven0) this.h, (lnm) null);
            this.e = null;
            this.b = true;
            Object objQ = l4p1.q(m441VarQ, xu41Var, this);
            d9n d9nVar = d9n.a;
            if (objQ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    private final Object m(Object obj) {
        hm5.M(obj);
        if (this.b) {
            ((Function0) this.e).invoke();
            y7e1 y7e1Var = (y7e1) this.c;
            h4e1 h4e1VarH = y7e1Var.h();
            try {
                u2p1.p(h4e1VarH);
                y7e1Var.a(h4e1VarH);
            } finally {
                y7e1Var.c();
            }
        } else {
            ven0 ven0Var = (ven0) this.g;
            float f = y251.b;
            ven0Var.setValue(uex0.a);
            ((ven0) this.h).setValue(Boolean.FALSE);
            az20.a((az20) this.d);
            b6t b6tVar = (k6a1) this.f;
            if (b6tVar != null) {
                b6tVar.a();
            }
        }
        return rih1.a;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                return new af0(this.e, (String) this.c, obj3, (String) this.d, (String) obj4, obj2, lnmVar, (byte) 0);
            case 1:
                af0 af0Var = new af0((rl1) obj4, (String) this.c, (lik1) obj3, (tv80) obj2, (String) this.d, lnmVar);
                af0Var.e = obj;
                return af0Var;
            case 2:
                return new af0((AgeAssuranceWebViewActivity) this.d, (fqk0) obj4, (p811) obj3, (tv80) obj2, (String) this.c, lnmVar);
            case 3:
                af0 af0Var2 = new af0(this.d, obj4, obj3, obj2, lnmVar, (byte) 3);
                af0Var2.c = obj;
                return af0Var2;
            case 4:
                return new af0((fta) this.e, (String) this.c, (String) this.d, (syf) obj3, (String) obj4, (ahh) obj2, lnmVar);
            case 5:
                af0 af0Var3 = new af0((byte) 5, this.c, this.d, obj4, obj3, obj2, lnmVar);
                af0Var3.e = obj;
                return af0Var3;
            case 6:
                af0 af0Var4 = new af0(obj4, obj3, obj2, lnmVar, (byte) 6);
                af0Var4.d = obj;
                return af0Var4;
            case 7:
                return new af0(this.e, this.c, this.d, obj4, obj3, obj2, lnmVar, (byte) 7);
            case 8:
                return new af0(this.e, (String) this.c, obj3, (String) this.d, (String) obj4, obj2, lnmVar, (byte) 8);
            case 9:
                return new af0((jnq) this.e, (List) obj4, (String) this.c, (String) this.d, (tv80) obj3, (gy1) obj2, this.b, lnmVar);
            case 10:
                return new af0(this.e, this.c, this.d, obj4, obj3, obj2, lnmVar, (byte) 10);
            case 11:
                return new af0(this.d, obj4, obj3, obj2, lnmVar, (byte) 11);
            case 12:
                af0 af0Var5 = new af0((byte) 12, this.c, this.d, obj4, obj3, obj2, lnmVar);
                af0Var5.e = obj;
                return af0Var5;
            case 13:
                af0 af0Var6 = new af0(obj4, obj3, obj2, lnmVar, (byte) 13);
                af0Var6.d = obj;
                return af0Var6;
            case 14:
                return new af0(this.b, (hdn0) this.e, (ven0) this.c, (ven0) this.d, (ven0) obj4, (ven0) obj3, (ven0) obj2, lnmVar, (byte) 14);
            case 15:
                return new af0(this.e, this.c, this.d, obj4, obj3, obj2, lnmVar, (byte) 15);
            case 16:
                af0 af0Var7 = new af0(obj4, obj3, obj2, lnmVar, (byte) 16);
                af0Var7.d = obj;
                return af0Var7;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new af0(this.e, this.c, this.d, obj4, obj3, obj2, lnmVar, (byte) 17);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                af0 af0Var8 = new af0((byte) 18, this.c, this.d, obj4, obj3, obj2, lnmVar);
                af0Var8.e = obj;
                return af0Var8;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new af0(this.e, this.c, this.d, obj4, obj3, obj2, lnmVar, (byte) 19);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new af0(this.e, this.c, this.d, obj4, obj3, obj2, lnmVar, (byte) 20);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new af0((String) this.c, (iu30) this.e, (c0y0) this.d, (jjm0) obj4, (pt) obj3, (wzx0) obj2, lnmVar);
            case 22:
                return new af0(this.e, this.c, this.d, obj4, obj3, obj2, lnmVar, (byte) 22);
            case 23:
                return new af0((gc01) this.e, (ed01) this.d, (String) this.c, (ven0) obj4, (hdn0) obj3, (hdn0) obj2, lnmVar);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new af0(this.d, obj4, obj3, obj2, lnmVar, (byte) 24);
            case 25:
                return new af0((List) this.e, (ne) obj3, (tv80) obj2, (String) this.c, (String) this.d, (String) obj4, lnmVar);
            case 26:
                af0 af0Var9 = new af0((ya31) obj4, (ccq) obj3, (String) this.c, (x390) obj2, lnmVar);
                af0Var9.d = obj;
                return af0Var9;
            case 27:
                af0 af0Var10 = new af0((byte) 27, this.c, this.d, obj4, obj3, obj2, lnmVar);
                af0Var10.e = obj;
                return af0Var10;
            case 28:
                return new af0(this.b, (Function0) this.e, (y7e1) this.c, (az20) this.d, (k6a1) obj4, (ven0) obj3, (ven0) obj2, lnmVar, (byte) 28);
            default:
                af0 af0Var11 = new af0((any) this.c, lnmVar, (hf31) this.d, (gpc) obj4, (gpc) obj3, (zu51) obj2);
                af0Var11.e = obj;
                return af0Var11;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:305:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:308:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:310:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:311:0x07f7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v20, types: [p.faa0] */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x0315 -> B:101:0x02d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:304:0x07da -> B:306:0x07de). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2754
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.af0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af0(AgeAssuranceWebViewActivity ageAssuranceWebViewActivity, fqk0 fqk0Var, p811 p811Var, tv80 tv80Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.d = ageAssuranceWebViewActivity;
        this.f = fqk0Var;
        this.g = p811Var;
        this.h = tv80Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ af0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.c = obj2;
        this.d = obj3;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ af0(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ af0(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ af0(Object obj, String str, Object obj2, String str2, String str3, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.c = str;
        this.g = obj2;
        this.d = str2;
        this.f = str3;
        this.h = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af0(String str, iu30 iu30Var, c0y0 c0y0Var, jjm0 jjm0Var, pt ptVar, wzx0 wzx0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 21;
        this.c = str;
        this.e = iu30Var;
        this.d = c0y0Var;
        this.f = jjm0Var;
        this.g = ptVar;
        this.h = wzx0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af0(List list, ne neVar, tv80 tv80Var, String str, String str2, String str3, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 25;
        this.e = list;
        this.g = neVar;
        this.h = tv80Var;
        this.c = str;
        this.d = str2;
        this.f = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af0(rl1 rl1Var, String str, lik1 lik1Var, tv80 tv80Var, String str2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.f = rl1Var;
        this.c = str;
        this.g = lik1Var;
        this.h = tv80Var;
        this.d = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af0(fta ftaVar, String str, String str2, syf syfVar, String str3, ahh ahhVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 4;
        this.e = ftaVar;
        this.c = str;
        this.d = str2;
        this.g = syfVar;
        this.f = str3;
        this.h = ahhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ af0(byte b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, lnm lnmVar) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.f = obj3;
        this.g = obj4;
        this.h = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af0(any anyVar, lnm lnmVar, hf31 hf31Var, gpc gpcVar, gpc gpcVar2, zu51 zu51Var) {
        super(2, lnmVar);
        this.a = (byte) 29;
        this.c = anyVar;
        this.d = hf31Var;
        this.f = gpcVar;
        this.g = gpcVar2;
        this.h = zu51Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af0(gc01 gc01Var, ed01 ed01Var, String str, ven0 ven0Var, hdn0 hdn0Var, hdn0 hdn0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 23;
        this.e = gc01Var;
        this.d = ed01Var;
        this.c = str;
        this.f = ven0Var;
        this.g = hdn0Var;
        this.h = hdn0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af0(ya31 ya31Var, ccq ccqVar, String str, x390 x390Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 26;
        this.f = ya31Var;
        this.g = ccqVar;
        this.c = str;
        this.h = x390Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ af0(boolean z, Object obj, Object obj2, Object obj3, Object obj4, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = z;
        this.e = obj;
        this.c = obj2;
        this.d = obj3;
        this.f = obj4;
        this.g = ven0Var;
        this.h = ven0Var2;
    }
}
