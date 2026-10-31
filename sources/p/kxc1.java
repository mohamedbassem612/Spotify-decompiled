package p;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kxc1 extends hab0 implements zu30 {
    public final /* synthetic */ kes a;
    public final /* synthetic */ mxc1 b;
    public final /* synthetic */ wat c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxc1(kes kesVar, mxc1 mxc1Var, wat watVar, float f, int i) {
        super(4);
        this.a = kesVar;
        this.b = mxc1Var;
        this.c = watVar;
        this.d = f;
        this.e = i;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj4).intValue();
        m4c m4cVar = fkj0.X;
        mxc1 mxc1Var = this.b;
        List list = mxc1Var.a;
        x340 x340Var = (b0k) obj3;
        kes kesVar = this.a;
        int i = (iIntValue2 & 112) ^ 48;
        boolean zG = x340Var.g(kesVar) | ((i > 32 && x340Var.e(iIntValue)) || (iIntValue2 & 48) == 32);
        Object objT = x340Var.T();
        if (zG || objT == m4cVar) {
            objT = new ym(kesVar, iIntValue, (byte) 24);
            x340Var.s0(objT);
        }
        qim0 qim0VarK = sto1.k(i541.C(nim0.a, (iu30) objT), d4o1.a, new bw61(lxc1.b, z4p1.e(((nxc1) list.get(iIntValue)).l), 0.0f, lxc1.a, 0.2f, 32, 0));
        boolean zG2 = x340Var.g(kesVar) | ((i > 32 && x340Var.e(iIntValue)) || (iIntValue2 & 48) == 32) | x340Var.i(mxc1Var);
        Object objT2 = x340Var.T();
        if (zG2 || objT2 == m4cVar) {
            objT2 = new ju01(iIntValue, kesVar, mxc1Var, (byte) 8);
            x340Var.s0(objT2);
        }
        qim0 qim0VarA = s161.a(qim0VarK, (iu30) objT2);
        nxc1 nxc1Var = (nxc1) list.get(iIntValue);
        ArrayList arrayList = nxc1Var.b;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new tp70((Bitmap) it.next()));
        }
        x660 x660Var = nxc1Var.c;
        Bitmap bitmap = nxc1Var.d;
        v660 v660Var = new v660(arrayList2, x660Var, bitmap != null ? new tp70(bitmap) : null, nxc1Var.e);
        tp70 tp70Var = new tp70(nxc1Var.f);
        zud zudVar = nxc1Var.g;
        zud zudVar2 = nxc1Var.h;
        zud zudVar3 = nxc1Var.i;
        zud zudVar4 = nxc1Var.j;
        String str = nxc1Var.k;
        int i2 = nxc1Var.l;
        String str2 = nxc1Var.m;
        String str3 = nxc1Var.n;
        boolean z = nxc1Var.o;
        Bitmap bitmap2 = nxc1Var.f45p;
        jxc1 jxc1Var = new jxc1(v660Var, tp70Var, zudVar, zudVar2, zudVar3, zudVar4, str, i2, str2, str3, z, bitmap2 != null ? new tp70(bitmap2) : null);
        float f = this.d;
        wat watVar = this.c;
        kto1.o(watVar.N0(f), watVar.M0(this.e), jxc1Var, qim0VarA, x340Var, 0);
        return rih1.a;
    }
}
