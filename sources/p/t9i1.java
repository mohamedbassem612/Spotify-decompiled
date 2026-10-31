package p;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t9i1 extends a8d1 implements iu30 {
    public uy10 a;
    public String b;
    public String c;
    public List d;
    public byte e;
    public final /* synthetic */ w9i1 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ e9i1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9i1(w9i1 w9i1Var, String str, e9i1 e9i1Var, lnm lnmVar) {
        super(1, lnmVar);
        this.f = w9i1Var;
        this.g = str;
        this.h = e9i1Var;
    }

    public final lnm create(lnm lnmVar) {
        return new t9i1(this.f, this.g, this.h, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        uy10 uy10Var;
        String str;
        List list;
        String str2;
        byte b = this.e;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            w9i1 w9i1Var = this.f;
            uy10Var = w9i1Var.g;
            str = w9i1Var.v1;
            list = this.h.d;
            vgr vgrVar = w9i1Var.b;
            this.a = uy10Var;
            this.b = str;
            String str3 = this.g;
            this.c = str3;
            this.d = list;
            this.e = (byte) 1;
            obj = Boolean.valueOf(vgrVar.b);
            if (obj != d9nVar) {
                str2 = str3;
            }
        }
        if (b != 1) {
            if (b == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        list = this.d;
        str2 = this.c;
        str = this.b;
        uy10Var = this.a;
        hm5.M(obj);
        Boolean bool = (Boolean) obj;
        bool.getClass();
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = (byte) 2;
        uy10Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("summary", str);
        linkedHashMap.put("description", str2);
        linkedHashMap.put("is_employee", bool);
        linkedHashMap.put("use_jira", Boolean.FALSE);
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((File) it.next()).getAbsolutePath());
        }
        linkedHashMap.put("file_paths", (String[]) arrayList.toArray(new String[0]));
        ewq ewqVar = new ewq(linkedHashMap);
        o0c.N(ewqVar);
        Object objB = uy10Var.b(ewqVar, this);
        return objB == d9nVar ? d9nVar : objB;
    }
}
