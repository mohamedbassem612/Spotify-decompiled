package p;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hd01 {
    public final File a;
    public final cxc b;
    public final o8n c;
    public final iu30 d;
    public final bpb1 e;
    public final xe01 f;

    public hd01(File file, cxc cxcVar, o8n o8nVar) {
        oa01 oa01Var = oa01.R0;
        this.a = file;
        this.b = cxcVar;
        this.c = o8nVar;
        this.d = oa01Var;
        bpb1 bpb1VarB = gio1.b(b7x.a);
        this.e = bpb1VarB;
        this.f = d5p1.h(bpb1VarB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        gd01 gd01Var;
        bpb1 bpb1Var;
        Iterator it;
        Object obj;
        d9n d9nVar;
        if (onmVar instanceof gd01) {
            gd01Var = (gd01) onmVar;
            int i = gd01Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gd01Var.d = i - Integer.MIN_VALUE;
            } else {
                gd01Var = new gd01(this, onmVar);
            }
        } else {
            gd01Var = new gd01(this, onmVar);
        }
        Object obj2 = gd01Var.b;
        int i2 = gd01Var.d;
        if (i2 == 0) {
            hm5.M(obj2);
            t0z t0zVar = fd01.g;
            ArrayList<fd01> arrayList = new ArrayList();
            t0zVar.getClass();
            d7 d7Var = new d7(t0zVar, (byte) 0);
            while (true) {
                boolean zHasNext = d7Var.hasNext();
                bpb1Var = this.e;
                if (!zHasNext) {
                    break;
                }
                Object next = d7Var.next();
                fd01 fd01Var = (fd01) next;
                if (fd01Var.b.length() > 0 && !((Map) bpb1Var.getValue()).containsKey(fd01Var)) {
                    arrayList.add(next);
                }
            }
            for (fd01 fd01Var2 : arrayList) {
                File file = new File(new File(this.a, "EReaderFonts"), fd01Var2.c);
                if (file.exists()) {
                    b(fd01Var2, file);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (!((Map) bpb1Var.getValue()).containsKey((fd01) obj3)) {
                    arrayList2.add(obj3);
                }
            }
            it = arrayList2.iterator();
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = gd01Var.a;
            hm5.M(obj2);
        }
        do {
            boolean zHasNext2 = it.hasNext();
            obj = rih1.a;
            if (!zHasNext2) {
                return obj;
            }
            fd01 fd01Var3 = (fd01) it.next();
            gd01Var.a = it;
            gd01Var.d = 1;
            Object objY = fn31.Y(this.c, new p2z0(fd01Var3, this, (lnm) null, (byte) 11), gd01Var);
            d9nVar = d9n.a;
            if (objY == d9nVar) {
                obj = objY;
            }
        } while (obj != d9nVar);
        return d9nVar;
    }

    public final void b(fd01 fd01Var, File file) {
        bpb1 bpb1Var = this.e;
        bpb1Var.m((Object) null, sqg0.P((Map) bpb1Var.getValue(), new mmr0(fd01Var, this.d.invoke(file))));
    }
}
