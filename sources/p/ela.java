package p;

import android.media.AudioDeviceInfo;
import com.spotify.inappuserfeedback.issuereporter.FeedbackSubmissionException;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ela extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ela(rdm1 rdm1Var, boolean z, odm1 odm1Var, qem1 qem1Var, ycm1 ycm1Var, g7m1 g7m1Var, lnm lnmVar) {
        super(1, lnmVar);
        this.a = (byte) 5;
        this.c = rdm1Var;
        this.b = z;
        this.d = odm1Var;
        this.e = qem1Var;
        this.f = ycm1Var;
        this.g = g7m1Var;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                return new ela((l2t) obj2, (List) obj, lnmVar);
            case 1:
                return new ela((byte) 1, this.c, this.d, this.e, obj2, obj, lnmVar);
            case 2:
                return new ela((mje) this.c, (d0r) this.d, (kdy0) obj2, (ahe) obj, (String) this.e, lnmVar);
            case 3:
                return new ela((byte) 3, this.c, this.d, this.e, obj2, obj, lnmVar);
            case 4:
                return new ela((w9i1) this.c, (String) this.e, (String) this.d, (e9i1) obj2, (eaa0) obj, lnmVar);
            default:
                return new ela((rdm1) this.c, this.b, (odm1) this.d, (qem1) this.e, (ycm1) obj2, (g7m1) obj, lnmVar);
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
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.inappuserfeedback.issuereporter.FeedbackSubmissionException */
    public final Object invokeSuspend(Object obj) throws FeedbackSubmissionException {
        bk41[] bk41VarArr;
        String str;
        Object objE;
        bk41[] bk41VarArr2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    bk41VarArr = new bk41[2];
                    this.c = bk41VarArr;
                    this.d = bk41VarArr;
                    str = "bespokeListeningAgeBgLayer";
                    this.e = "bespokeListeningAgeBgLayer";
                    this.b = true;
                    objE = ((l2t) obj3).E(this);
                    if (objE == d9nVar) {
                        return d9nVar;
                    }
                    bk41VarArr2 = bk41VarArr;
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) this.e;
                    bk41VarArr = (bk41[]) this.d;
                    bk41[] bk41VarArr3 = (bk41[]) this.c;
                    hm5.M(obj);
                    bk41VarArr2 = bk41VarArr3;
                    objE = obj;
                }
                bk41VarArr[0] = new bk41(str, Collections.singletonList(objE));
                bk41VarArr2[1] = new bk41("bespokeListeningAgeRevealLayer", (List) obj2);
                return p7h.M(bk41VarArr2);
            case 1:
                zwg zwgVar = (zwg) obj2;
                ayh ayhVar = (zxh) obj3;
                uw7 uw7Var = ((phb) this.d).b;
                boolean z2 = this.b;
                pw7 pw7Var = pw7.a;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        ((AtomicBoolean) this.c).set(true);
                        pw7Var.b(uw7Var.a);
                        AudioDeviceInfo audioDeviceInfoD = pw7Var.d(uw7Var.a);
                        rt7 rt7Var = audioDeviceInfoD != null ? new rt7(audioDeviceInfoD) : null;
                        if (rt7Var == null || rt7Var.a.getId() != ((qt7) this.e).getId()) {
                            ayhVar.m0(rih1Var);
                        }
                        c38 c38Var = new c38(ayhVar, null, (byte) 1);
                        this.b = true;
                        if (rc2.M(2000L, c38Var, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    uw7 uw7Var2 = uw7Var;
                    Object objRemove = uw7Var2.e.remove(zwgVar);
                    if (objRemove == null) {
                        return rih1Var;
                    }
                    pw7Var.f(uw7Var2.a, objRemove);
                    return rih1Var;
                } catch (Throwable th) {
                    uw7 uw7Var3 = uw7Var;
                    Object objRemove2 = uw7Var3.e.remove(zwgVar);
                    if (objRemove2 != null) {
                        pw7Var.f(uw7Var3.a, objRemove2);
                    }
                    throw th;
                }
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    String str2 = (String) this.e;
                    this.b = true;
                    return ((mje) this.c).e((d0r) this.d, (kdy0) obj3, (ahe) obj2, str2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dnc dncVar = (dnc) ((zog) this.c).e;
                er00 er00Var = ((hob1) this.d).h;
                enc encVarE = upo1.E((mey0) this.e, (hob1) this.d, (tqw) obj3, er00Var instanceof dr00, (Long) obj2, rwq.n((mey0) this.e, er00Var));
                this.b = true;
                return dncVar.b(encVarE, this) == d9nVar ? d9nVar : rih1Var;
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
                w9i1 w9i1Var = (w9i1) this.c;
                uy10 uy10Var = w9i1Var.g;
                String str3 = (String) this.e;
                String str4 = (String) this.d;
                List list = ((e9i1) obj3).d;
                eaa0 eaa0Var = (eaa0) obj2;
                String str5 = w9i1Var.O0;
                if (str5 != null) {
                    if (ihc1.y0(str5)) {
                        str5 = null;
                    }
                    if (str5 != null) {
                        this.b = true;
                        uy10Var.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("summary", str3);
                        linkedHashMap.put("description", str4);
                        linkedHashMap.put("use_jira", Boolean.TRUE);
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((File) it.next()).getAbsolutePath());
                        }
                        linkedHashMap.put("file_paths", (String[]) arrayList.toArray(new String[0]));
                        String str6 = eaa0Var.a;
                        if (str6 != null) {
                            linkedHashMap.put("jira_feature", str6);
                        }
                        List list3 = eaa0Var.b;
                        if (list3 != null) {
                            linkedHashMap.put("jira_labels", (String[]) list3.toArray(new String[0]));
                        }
                        String str7 = eaa0Var.c;
                        if (str7 != null) {
                            linkedHashMap.put("jira_report_source", str7);
                        }
                        String str8 = eaa0Var.g;
                        if (str8 != null) {
                            linkedHashMap.put("jira_project_key", str8);
                        }
                        ewq ewqVar = new ewq(linkedHashMap);
                        o0c.N(ewqVar);
                        Object objA = uy10Var.a(ewqVar, list, str5, this);
                        return objA == d9nVar ? d9nVar : objA;
                    }
                }
                throw new FeedbackSubmissionException("Sign in to submit this report.", null);
            default:
                hm5.M(obj);
                rdm1 rdm1Var = (rdm1) this.c;
                boolean z6 = this.b;
                odm1 odm1Var = (odm1) this.d;
                return Collections.singletonList(new bk41("wrappedPlacesPanoramaLayer", Collections.singletonList(new cem1(rdm1Var, z6, odm1Var.g, (qem1) this.e, (ycm1) obj3, odm1Var.f, ((g7m1) obj2).a.getId()))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ela(mje mjeVar, d0r d0rVar, kdy0 kdy0Var, ahe aheVar, String str, lnm lnmVar) {
        super(1, lnmVar);
        this.a = (byte) 2;
        this.c = mjeVar;
        this.d = d0rVar;
        this.f = kdy0Var;
        this.g = aheVar;
        this.e = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ela(l2t l2tVar, List list, lnm lnmVar) {
        super(1, lnmVar);
        this.a = (byte) 0;
        this.f = l2tVar;
        this.g = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ela(w9i1 w9i1Var, String str, String str2, e9i1 e9i1Var, eaa0 eaa0Var, lnm lnmVar) {
        super(1, lnmVar);
        this.a = (byte) 4;
        this.c = w9i1Var;
        this.e = str;
        this.d = str2;
        this.f = e9i1Var;
        this.g = eaa0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ela(byte b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, lnm lnmVar) {
        super(1, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }
}
