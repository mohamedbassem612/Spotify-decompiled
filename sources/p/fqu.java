package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class fqu implements Update {
    public static final fqu a = new fqu();

    public final Next a(Object obj, Object obj2) {
        eo5 eo5Var = (eo5) obj;
        co5 co5Var = (co5) obj2;
        List list = eo5Var.a;
        if (co5Var instanceof zn5) {
            return Next.h(new eo5(list, ((zn5) co5Var).a));
        }
        int i = -1;
        int i2 = 0;
        if (co5Var instanceof ao5) {
            do5 do5Var = ((ao5) co5Var).a;
            Iterator it = list.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                if (((tn5) it.next()).a.equals(do5Var)) {
                    i = i3;
                    break;
                }
                i3++;
            }
            Set setW0 = dm61.w0(new xn5[]{new vn5(i)});
            if (!u890.j(eo5Var.b, do5Var)) {
                setW0.add(new un5(do5Var));
            }
            return Next.a(setW0);
        }
        if (!(co5Var instanceof bo5)) {
            if (co5Var instanceof yn5) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        do5 do5Var2 = ((bo5) co5Var).a;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (((tn5) it2.next()).a.equals(do5Var2)) {
                i = i2;
                break;
            }
            i2++;
        }
        return Next.a(Collections.singleton(new wn5(i)));
    }
}
