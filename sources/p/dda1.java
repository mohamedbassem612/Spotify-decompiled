package p;

import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dda1 {
    public static final Set e = f46.S0(new wy41[]{wy41.a, wy41.b});
    public static final long f;
    public static final long g;
    public final m021 a;
    public final q8n b;
    public final bpb1 c;
    public final xe01 d;

    static {
        ytw0 ytw0Var = jfv.b;
        f = fdg1.k0(200, ngv.d);
        g = fdg1.k0(30, ngv.e);
    }

    public dda1(m021 m021Var, q8n q8nVar) {
        int i = yca1.a;
        this.a = m021Var;
        this.b = q8nVar;
        bpb1 bpb1VarB = gio1.b(wca1.a);
        this.c = bpb1VarB;
        this.d = d5p1.h(bpb1VarB);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, onm onmVar) {
        zca1 zca1Var;
        Throwable th;
        UUID uuid;
        if (onmVar instanceof zca1) {
            zca1Var = (zca1) onmVar;
            int i = zca1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zca1Var.d = i - Integer.MIN_VALUE;
            } else {
                zca1Var = new zca1(this, onmVar);
            }
        } else {
            zca1Var = new zca1(this, onmVar);
        }
        zca1 zca1Var2 = zca1Var;
        Object objP = zca1Var2.b;
        int i2 = zca1Var2.d;
        long j = g;
        if (i2 == 0) {
            hm5.M(objP);
            int i3 = yca1.a;
            UUID uuidRandomUUID = UUID.randomUUID();
            try {
                uk71 uk71Var = new uk71(this, str, uuidRandomUUID, (lnm) null, (byte) 21);
                zca1Var2.a = uuidRandomUUID;
                zca1Var2.d = 1;
                objP = rc2.P(j, uk71Var, zca1Var2);
                d9n d9nVar = d9n.a;
                if (objP == d9nVar) {
                    return d9nVar;
                }
                uuid = uuidRandomUUID;
            } catch (Throwable th2) {
                th = th2;
                uuid = uuidRandomUUID;
                op71.x(zca1Var2.getContext());
                Logger.l(th, "SongDNA search: loading the results failed.", new Object[0]);
                return new tca1(uuid);
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uuid = zca1Var2.a;
            try {
                hm5.M(objP);
            } catch (Throwable th3) {
                th = th3;
                op71.x(zca1Var2.getContext());
                Logger.l(th, "SongDNA search: loading the results failed.", new Object[0]);
                return new tca1(uuid);
            }
        }
        xca1 xca1Var = (xca1) objP;
        if (xca1Var != null) {
            return xca1Var;
        }
        Logger.k("SongDNA search: the results did not arrive within %s.", new Object[]{new jfv(j)});
        return new tca1(uuid);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, UUID uuid, onm onmVar) {
        ada1 ada1Var;
        Object jca1Var;
        if (onmVar instanceof ada1) {
            ada1Var = (ada1) onmVar;
            int i = ada1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ada1Var.e = i - Integer.MIN_VALUE;
            } else {
                ada1Var = new ada1(this, onmVar);
            }
        } else {
            ada1Var = new ada1(this, onmVar);
        }
        Object objL = ada1Var.c;
        int i2 = ada1Var.e;
        if (i2 == 0) {
            hm5.M(objL);
            ada1Var.a = str;
            ada1Var.b = uuid;
            ada1Var.e = 1;
            objL = this.a.l(40, str, e, ada1Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uuid = ada1Var.b;
            str = ada1Var.a;
            hm5.M(objL);
        }
        rv41 rv41Var = (rv41) objL;
        if (u890.j(rv41Var, pv41.a)) {
            return new tca1(uuid);
        }
        if (!(rv41Var instanceof qv41)) {
            eg.o();
            return null;
        }
        qv41 qv41Var = (qv41) rv41Var;
        List list = qv41Var.a;
        HashSet hashSet = new HashSet();
        ArrayList<dw41> arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((dw41) obj).getUri())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (dw41 dw41Var : arrayList) {
            if (dw41Var instanceof bw41) {
                jca1Var = new ica1(((bw41) dw41Var).a);
            } else {
                if (!(dw41Var instanceof cw41)) {
                    eg.o();
                    return null;
                }
                jca1Var = new jca1(((cw41) dw41Var).a);
            }
            arrayList2.add(jca1Var);
        }
        return new uca1(str, arrayList2, uuid, qv41Var.b);
    }
}
