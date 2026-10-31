package p;

import com.spotify.metadata.cosmos.proto.MetadataCosmos;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class xr6 implements Function {
    public final String a;

    public /* synthetic */ xr6(String str) {
        this.a = str;
    }

    public static xr6 b(izr0 izr0Var) {
        String str;
        izr0Var.S(2);
        int iE = izr0Var.E();
        int i = iE >> 1;
        int iE2 = ((izr0Var.E() >> 3) & 31) | ((iE & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(i < 10 ? ".0" : ".");
        sb.append(i);
        return new xr6(gvg.l(sb, iE2 < 10 ? ".0" : ".", iE2));
    }

    public ia00 a(zu30 zu30Var, zu30 zu30Var2) {
        return new ia00(this.a, zu30Var, zu30Var2);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public Object apply(Object obj) {
        List itemsList = ((MetadataCosmos.MultiResponse) obj).getItemsList();
        ArrayList arrayList = new ArrayList();
        Iterator it = itemsList.iterator();
        while (it.hasNext()) {
            u310 u310VarE = o3e0.e(((MetadataCosmos.MetadataItem) it.next()).n(), this.a);
            if (u310VarE != null) {
                arrayList.add(u310VarE);
            }
        }
        return arrayList;
    }

    public xr6(yr6 yr6Var, String str) {
        this.a = str;
    }
}
