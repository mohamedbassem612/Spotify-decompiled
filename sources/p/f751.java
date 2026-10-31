package p;

import android.content.Intent;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f751 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fw0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f751(fw0 fw0Var, byte b) {
        super(3);
        this.a = b;
        this.b = fw0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        l651 l651Var;
        byte b = this.a;
        l651 l651Var2 = l651.a;
        gyh gyhVar = gyh.c;
        fw0 fw0Var = this.b;
        switch (b) {
            case 0:
                th61 th61Var = (th61) obj3;
                String str = th61Var.a;
                String strZ = ((s4b1) obj2).z();
                strZ.getClass();
                return fw0Var.b(new y651(str, strZ, (String) null, th61Var.h, (gyh) null, (l651) null, 112));
            case 1:
                Intent intent = (Intent) obj;
                s4b1 s4b1Var = (s4b1) obj2;
                th61 th61Var2 = (th61) obj3;
                String str2 = th61Var2.a;
                String strZ2 = s4b1Var.z();
                strZ2.getClass();
                String strI = s4b1Var.i(1);
                boolean z = th61Var2.h;
                Serializable serializableExtra = intent.getSerializableExtra("queryCompletionSource");
                gyh gyhVar2 = serializableExtra instanceof gyh ? (gyh) serializableExtra : null;
                gyh gyhVar3 = (gyhVar2 == null ? -1 : e751.a[gyhVar2.ordinal()]) == -1 ? gyhVar : gyhVar2;
                Serializable serializableExtra2 = intent.getSerializableExtra("searchOrigin");
                l651Var = serializableExtra2 instanceof l651 ? (l651) serializableExtra2 : null;
                return fw0Var.b(new y651(str2, strZ2, strI, z, gyhVar3, l651Var == null ? l651Var2 : l651Var, 16));
            case 2:
                Intent intent2 = (Intent) obj;
                s4b1 s4b1Var2 = (s4b1) obj2;
                th61 th61Var3 = (th61) obj3;
                String str3 = th61Var3.a;
                String strZ3 = s4b1Var2.z();
                strZ3.getClass();
                String strJ = s4b1Var2.j();
                if (strJ == null) {
                    strJ = "";
                }
                String str4 = strJ;
                boolean z2 = th61Var3.h;
                Serializable serializableExtra3 = intent2.getSerializableExtra("queryCompletionSource");
                gyh gyhVar4 = serializableExtra3 instanceof gyh ? (gyh) serializableExtra3 : null;
                gyh gyhVar5 = (gyhVar4 == null ? -1 : e751.a[gyhVar4.ordinal()]) == -1 ? gyhVar : gyhVar4;
                Serializable serializableExtra4 = intent2.getSerializableExtra("searchOrigin");
                l651Var = serializableExtra4 instanceof l651 ? (l651) serializableExtra4 : null;
                return fw0Var.b(new y651(str3, strZ3, str4, z2, gyhVar5, l651Var == null ? l651Var2 : l651Var, 16));
            default:
                th61 th61Var4 = (th61) obj3;
                String str5 = th61Var4.a;
                String strZ4 = ((s4b1) obj2).z();
                strZ4.getClass();
                return fw0Var.b(new y651(str5, strZ4, (String) null, th61Var4.h, (112 & 16) == 0, (gyh) null, l651.b));
        }
    }
}
