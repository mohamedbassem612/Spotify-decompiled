package p;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class fc4 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ fc4(qim0 qim0Var, int i, int i2) {
        this.a = (byte) 0;
        this.c = qim0Var;
        this.b = i2;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0 A[LOOP:0: B:22:0x0064->B:37:0x00a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00de A[LOOP:2: B:43:0x00ab->B:54:0x00de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0039 A[SYNTHETIC] */
    public final Object invoke(Object obj, Object obj2) {
        Object next;
        String str;
        mmr0 mmr0Var;
        String str2;
        boolean z;
        mmr0 mmr0Var2;
        Object next2;
        String str3;
        String str4;
        String str5;
        int length;
        byte b = this.a;
        o8n o8nVar = null;
        rih1 rih1Var = rih1.a;
        boolean z2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                kc4.b(czo1.p(1), z2 ? 1 : 0, (b0k) obj, (qim0) obj3);
                return rih1Var;
            case 1:
                ((Integer) obj2).getClass();
                eko1.n((x6e1) obj3, z2, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                p811 p811Var = (p811) obj3;
                o8n o8nVar2 = (o8n) obj;
                o8n o8nVar3 = (m8n) obj2;
                if (!(o8nVar3 instanceof l4n)) {
                    return o8nVar2.y(o8nVar3);
                }
                if (((o8n) p811Var.a).A(o8nVar3.getKey()) != null) {
                    p811Var.a = ((o8n) p811Var.a).C(o8nVar3.getKey());
                    return o8nVar2.y(((l4n) o8nVar3).z());
                }
                if (z2) {
                    ((l4n) o8nVar3).m();
                } else {
                    o8nVar = (l4n) o8nVar3;
                }
                return o8nVar2.y(o8nVar);
            case 3:
                DrawScope drawScope = (DrawScope) obj;
                lb91 lb91Var = lb91.a;
                DrawScope.b0(drawScope, ((fb91) obj3).a(z2, true), drawScope.X0(4.0f) / 2.0f, ((Offset) obj2).a, 0.0f, (DrawStyle) null, 120);
                return rih1Var;
            default:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                List list = (List) obj3;
                boolean z3 = this.b;
                if (z3 || list.size() != 1) {
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    tr80 tr80Var = new tr80(iIntValue, charSequence.length(), 1);
                    boolean z4 = charSequence instanceof String;
                    int i = ((rr80) tr80Var).c;
                    int i2 = ((rr80) tr80Var).b;
                    if (z4) {
                        if ((i > 0 && iIntValue <= i2) || (i < 0 && i2 <= iIntValue)) {
                            int i3 = iIntValue;
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str4 = (String) next2;
                                        str5 = (String) charSequence;
                                        length = str4.length();
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        mmr0Var = new mmr0(Integer.valueOf(i3), str3);
                                        mmr0Var2 = mmr0Var;
                                    } else if (i3 != i2) {
                                        i3 += i;
                                    }
                                } while (!(!z3 ? str4.regionMatches(0, str5, i3, length) : str4.regionMatches(z3, 0, str5, i3, length)));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    mmr0Var = new mmr0(Integer.valueOf(i3), str3);
                                    mmr0Var2 = mmr0Var;
                                } else if (i3 != i2) {
                                    i3 += i;
                                }
                            }
                        }
                    } else {
                        if ((i > 0 && iIntValue <= i2) || (i < 0 && i2 <= iIntValue)) {
                            int i4 = iIntValue;
                            while (true) {
                                Iterator it2 = list.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        str2 = (String) next;
                                        z = z3;
                                        z3 = z;
                                    } else {
                                        next = null;
                                    }
                                    str = (String) next;
                                    if (str != null) {
                                        mmr0Var = new mmr0(Integer.valueOf(i4), str);
                                        mmr0Var2 = mmr0Var;
                                    } else if (i4 != i2) {
                                        i4 += i;
                                    }
                                } while (!ihc1.G0(str2, 0, charSequence, i4, str2.length(), z));
                                str = (String) next;
                                if (str != null) {
                                    mmr0Var = new mmr0(Integer.valueOf(i4), str);
                                    mmr0Var2 = mmr0Var;
                                } else if (i4 != i2) {
                                    i4 += i;
                                }
                            }
                        }
                    }
                } else {
                    String str6 = (String) o7h.U0(list);
                    int iW0 = ihc1.w0(charSequence, str6, iIntValue, false, 4);
                    mmr0Var2 = iW0 < 0 ? null : new mmr0(Integer.valueOf(iW0), str6);
                }
                if (mmr0Var2 != null) {
                    return new mmr0(mmr0Var2.a, Integer.valueOf(((String) mmr0Var2.b).length()));
                }
                return null;
        }
    }

    public /* synthetic */ fc4(Object obj, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    public /* synthetic */ fc4(x6e1 x6e1Var, boolean z, int i) {
        this.a = (byte) 1;
        this.c = x6e1Var;
        this.b = z;
    }
}
