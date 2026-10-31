package p;

import com.spotify.player.model.ContextTrack;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xfw0 {
    public final z98 a;
    public final oy1 b;
    public final f971 c;
    public final jl21 d;
    public final oh41 e;
    public final u961 f;

    public xfw0(z98 z98Var, oy1 oy1Var, f971 f971Var, jl21 jl21Var, oh41 oh41Var, u961 u961Var) {
        this.a = z98Var;
        this.b = oy1Var;
        this.c = f971Var;
        this.d = jl21Var;
        this.e = oh41Var;
        this.f = u961Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, String str2, lik1 lik1Var, boolean z, onm onmVar) {
        vfw0 vfw0Var;
        zfm zfmVar;
        ArrayList arrayList;
        if (onmVar instanceof vfw0) {
            vfw0Var = (vfw0) onmVar;
            int i = vfw0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                vfw0Var.e = i - Integer.MIN_VALUE;
            } else {
                vfw0Var = new vfw0(this, onmVar);
            }
        } else {
            vfw0Var = new vfw0(this, onmVar);
        }
        vfw0 vfw0Var2 = vfw0Var;
        Object obj = vfw0Var2.c;
        int i2 = vfw0Var2.e;
        if (i2 == 0) {
            hm5.M(obj);
            List list = this.a.b.d;
            ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ho70) it.next()).a);
            }
            vfw0Var2.a = arrayList2;
            zfm zfmVar2 = zfm.c;
            vfw0Var2.b = zfmVar2;
            vfw0Var2.e = 1;
            Serializable serializableB = b(str, str2, lik1Var, z, vfw0Var2);
            Serializable serializable = d9n.a;
            if (serializableB == serializable) {
                return serializable;
            }
            obj = serializableB;
            zfmVar = zfmVar2;
            arrayList = arrayList2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zfmVar = vfw0Var2.b;
            arrayList = vfw0Var2.a;
            hm5.M(obj);
        }
        return new tfw0(arrayList, zfmVar, (List) obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(String str, String str2, lik1 lik1Var, boolean z, onm onmVar) {
        wfw0 wfw0Var;
        List listN;
        String str3;
        List list;
        String str4;
        Object obj;
        String str5;
        List list2;
        if (onmVar instanceof wfw0) {
            wfw0Var = (wfw0) onmVar;
            int i = wfw0Var.X;
            if ((i & Integer.MIN_VALUE) != 0) {
                wfw0Var.X = i - Integer.MIN_VALUE;
            } else {
                wfw0Var = new wfw0(this, onmVar);
            }
        } else {
            wfw0Var = new wfw0(this, onmVar);
        }
        Object obj2 = wfw0Var.i;
        int i2 = wfw0Var.X;
        if (i2 == 0) {
            hm5.M(obj2);
            String str6 = this.a.a;
            listN = k4p1.n();
            wfw0Var.a = str;
            wfw0Var.b = str2;
            wfw0Var.c = lik1Var;
            wfw0Var.d = str6;
            wfw0Var.e = listN;
            wfw0Var.f = listN;
            wfw0Var.g = listN;
            wfw0Var.h = z;
            wfw0Var.X = 1;
            Object objS = this.f.s(str6, wfw0Var);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
            str3 = str2;
            list = listN;
            str4 = str6;
            obj = objS;
            str5 = str;
            list2 = list;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = wfw0Var.h;
            list2 = wfw0Var.g;
            list = wfw0Var.f;
            List list3 = wfw0Var.e;
            String str7 = wfw0Var.d;
            lik1 lik1Var2 = wfw0Var.c;
            str3 = wfw0Var.b;
            str5 = wfw0Var.a;
            hm5.M(obj2);
            listN = list3;
            lik1Var = lik1Var2;
            str4 = str7;
            obj = obj2;
        }
        list2.add(obj);
        if (z) {
            ContextTrack.Builder builder = ContextTrack.builder(str5);
            xkg0 xkg0Var = new xkg0();
            xkg0Var.put("context_uri", str3);
            xkg0Var.put("media.start_position", "0");
            xkg0Var.put("is_pre_release", "true");
            list.add(this.b.b(lik1Var, Collections.singletonList(builder.metadata(xkg0Var.b()).build())));
        }
        list.add(f971.b(this.c, str4, (String) null));
        list.add(jl21.b(this.d, str4, lik1Var));
        list.add(this.e.a(str4));
        return k4p1.k(listN);
    }
}
