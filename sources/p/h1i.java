package p;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h1i {
    public final List a;
    public final List b;
    public final List c;
    public List d;
    public List e;
    public final idd1 f;
    public final idd1 g;

    public h1i(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        final byte b = 0;
        this.f = new idd1(new Function0(this) { // from class: p.e1i
            public final /* synthetic */ h1i b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                z6x z6xVar = z6x.a;
                int i = 0;
                h1i h1iVar = this.b;
                switch (b2) {
                    case 0:
                        List list6 = h1iVar.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i < size) {
                            r7h.W((List) ((Function0) list6.get(i)).invoke(), arrayList);
                            i++;
                        }
                        h1iVar.d = z6xVar;
                        return arrayList;
                    default:
                        List list7 = h1iVar.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i < size2) {
                            r7h.W((List) ((Function0) list7.get(i)).invoke(), arrayList2);
                            i++;
                        }
                        h1iVar.e = z6xVar;
                        return arrayList2;
                }
            }
        });
        final byte b2 = 1;
        this.g = new idd1(new Function0(this) { // from class: p.e1i
            public final /* synthetic */ h1i b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b3 = b2;
                z6x z6xVar = z6x.a;
                int i = 0;
                h1i h1iVar = this.b;
                switch (b3) {
                    case 0:
                        List list6 = h1iVar.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i < size) {
                            r7h.W((List) ((Function0) list6.get(i)).invoke(), arrayList);
                            i++;
                        }
                        h1iVar.d = z6xVar;
                        return arrayList;
                    default:
                        List list7 = h1iVar.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i < size2) {
                            r7h.W((List) ((Function0) list7.get(i)).invoke(), arrayList2);
                            i++;
                        }
                        h1iVar.e = z6xVar;
                        return arrayList2;
                }
            }
        });
    }
}
