package p;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class owv0 extends pim0 implements m7v, j4k {
    public static final List R0 = p7h.M(new Offset[]{new Offset((((long) Float.floatToRawIntBits(-0.08f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), new Offset((((long) Float.floatToRawIntBits(1.1f)) << 32) | (((long) Float.floatToRawIntBits(1.03f)) & 4294967295L))});
    public hw61 O0;
    public long P0;
    public List Q0;

    public final void t0(lsl lslVar) {
        lsl lslVar2;
        if (Size.g(lslVar.j())) {
            lslVar2 = lslVar;
        } else {
            afx afxVar = (afx) lcc.z(this, gfx.a);
            z1a1 z1a1VarA = this.O0.a(lslVar.j(), lslVar.getLayoutDirection(), lslVar);
            lslVar2 = lslVar;
            vpb1.w(lslVar2, z1a1VarA, afxVar.a.b.a(), (phc1) null, 60);
            long j = afxVar.c.c;
            long j2 = this.P0;
            int i = u7h.l;
            if (!z4h1.b(j, j2)) {
                this.P0 = j;
                List list = R0;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new bw40(j, ((Offset) it.next()).a));
                }
                this.Q0 = arrayList;
            }
            Iterator it2 = this.Q0.iterator();
            while (it2.hasNext()) {
                vpb1.u(lslVar2, z1a1VarA, (bw40) it2.next(), 0.0f, 0, 60);
            }
        }
        lslVar2.s1();
    }
}
