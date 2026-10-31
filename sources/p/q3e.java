package p;

import android.os.Bundle;
import android.os.Parcelable;
import io.reactivex.rxjava3.functions.Function;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q3e implements Function, hj71 {
    public final Map a;

    public q3e(Bundle bundle) {
        this.a = s3o1.z(bundle, "com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(k371 k371Var, onm onmVar) {
        zbc1 zbc1Var;
        if (onmVar instanceof zbc1) {
            zbc1Var = (zbc1) onmVar;
            int i = zbc1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zbc1Var.c = i - Integer.MIN_VALUE;
            } else {
                zbc1Var = new zbc1(this, onmVar);
            }
        } else {
            zbc1Var = new zbc1(this, onmVar);
        }
        Object objA = zbc1Var.a;
        int i2 = zbc1Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            Parcelable parcelable = (Parcelable) jhc1.t(k371Var.b, "storytelling.share.loader_params", Parcelable.class);
            if (parcelable != null) {
                Object obj = this.a.get(parcelable.getClass());
                xbc1 xbc1Var = obj instanceof xbc1 ? (xbc1) obj : null;
                if (xbc1Var != null) {
                    zbc1Var.c = 1;
                    objA = xbc1Var.a(parcelable, zbc1Var);
                    d9n d9nVar = d9n.a;
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                }
            }
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objA);
        return (List) objA;
    }

    public Object apply(Object obj) {
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            boolean z = ((f7h) entry.getValue()).a;
            boolean z2 = ((f7h) entry.getValue()).b;
            Object key2 = entry.getKey();
            Map map2 = this.a;
            q730 q730Var = (q730) map2.get(key2);
            int i = 0;
            int i2 = q730Var != null ? q730Var.c : 0;
            q730 q730Var2 = (q730) map2.get(entry.getKey());
            if (q730Var2 != null) {
                i = q730Var2.d;
            }
            linkedHashMap.put(key, new q730(i2, i, z, z2));
        }
        return linkedHashMap;
    }

    public int b(int i) {
        Integer num;
        Map map = this.a;
        if (map == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf) && (num = (Integer) map.get(numValueOf)) != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(k371 k371Var, lnm lnmVar) {
        ybc1 ybc1Var;
        cmt cmtVar;
        if (lnmVar instanceof ybc1) {
            ybc1Var = (ybc1) lnmVar;
            int i = ybc1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ybc1Var.d = i - Integer.MIN_VALUE;
            } else {
                ybc1Var = new ybc1(this, (onm) lnmVar);
            }
        } else {
            ybc1Var = new ybc1(this, (onm) lnmVar);
        }
        Object obj = ybc1Var.b;
        int i2 = ybc1Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            cmt cmtVar2 = (cmt) jhc1.t(k371Var.b, "storytelling.share.destination_list_configuration", cmt.class);
            if (cmtVar2 != null) {
                ybc1Var.a = cmtVar2;
                ybc1Var.d = 1;
                Object objA = a(k371Var, ybc1Var);
                Object obj2 = d9n.a;
                if (objA == obj2) {
                    return obj2;
                }
                obj = objA;
                cmtVar = cmtVar2;
            }
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        cmtVar = ybc1Var.a;
        hm5.M(obj);
        List list = (List) obj;
        if (list != null) {
            return new qj71(list, 0, new quk(new va71(cmtVar)));
        }
        return null;
    }
}
