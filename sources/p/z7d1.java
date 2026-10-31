package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class z7d1 {
    public static final tcn0 a;

    static {
        bkz bkzVar = bkz.a;
        h7x h7xVar = new h7x((zim0) bkz.b, sfb1.f, false);
        ajn0 ajn0VarG = sfb1.g.a.g();
        noe0 noe0Var = voe0.e;
        tcn0 tcn0Var = new tcn0(h7xVar, ajn0VarG, noe0Var);
        tcn0Var.h = 4;
        tcn0Var.i = mht.e;
        List listSingletonList = Collections.singletonList(z0h1.A1(tcn0Var, 2, ajn0.e("T"), 0, noe0Var));
        if (tcn0Var.X != null) {
            bhn0.y(tcn0Var.getName(), "Type parameters are already set for ");
            return;
        }
        ArrayList arrayList = new ArrayList(listSingletonList);
        tcn0Var.X = arrayList;
        tcn0Var.t = new oeg(tcn0Var, arrayList, tcn0Var.Y, tcn0Var.Z);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            tcn0.l0(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((xdg) ((ov30) it.next())).h = tcn0Var.m();
        }
        a = tcn0Var;
    }
}
