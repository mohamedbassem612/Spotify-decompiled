package p;

import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gab1 implements v9t {
    public final char a;
    public int b = 0;
    public final LinkedList c = new LinkedList();

    public gab1(char c) {
        this.a = c;
    }

    @Override // p.v9t
    public final int a(u9t u9tVar, u9t u9tVar2) {
        int size = u9tVar.a.size();
        LinkedList<v9t> linkedList = this.c;
        for (v9t v9tVar : linkedList) {
            if (v9tVar.c() <= size) {
                return v9tVar.a(u9tVar, u9tVar2);
            }
        }
        v9tVar = (v9t) linkedList.getFirst();
        return v9tVar.a(u9tVar, u9tVar2);
    }

    @Override // p.v9t
    public final char b() {
        return this.a;
    }

    @Override // p.v9t
    public final int c() {
        return this.b;
    }

    @Override // p.v9t
    public final char d() {
        return this.a;
    }

    public final void e(v9t v9tVar) {
        int iC = v9tVar.c();
        LinkedList linkedList = this.c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            v9t v9tVar2 = (v9t) listIterator.next();
            int iC2 = v9tVar2.c();
            if (iC > iC2) {
                listIterator.previous();
                listIterator.add(v9tVar);
                return;
            } else if (iC == iC2) {
                String strValueOf = String.valueOf(v9tVar2);
                String strValueOf2 = String.valueOf(v9tVar);
                StringBuilder sb = new StringBuilder("Cannot add two delimiter processors for char '");
                sb.append(this.a);
                sb.append("' and minimum length ");
                sb.append(iC);
                sb.append("; conflicting processors: ");
                hhg1.n(l1d.q(sb, strValueOf, ", ", strValueOf2));
                return;
            }
        }
        linkedList.add(v9tVar);
        this.b = iC;
    }
}
