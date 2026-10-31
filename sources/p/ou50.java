package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ou50 extends hab0 implements iu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou50(int i, int i2, int i3, ArrayList arrayList, int i4) {
        super(1);
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = arrayList;
        this.e = i4;
    }

    public final Object invoke(Object obj) {
        p5t0 p5t0Var = (p5t0) obj;
        int i = this.a;
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            iArr[i3] = 0;
        }
        for (int i4 = 0; i4 < i; i4++) {
            iArr[i4] = (this.b + this.c) * i4;
        }
        int[] iArr2 = new int[i];
        for (int i5 = 0; i5 < i; i5++) {
            iArr2[i5] = 0;
        }
        for (Object obj2 : this.d) {
            int i6 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            int i7 = iArr2[i2];
            int i8 = this.e;
            iArr2[i2] = i7 + i8;
            for (q5t0 q5t0Var : (List) obj2) {
                p5t0Var.k(q5t0Var, iArr2[i2], iArr[i2], 0.0f);
                iArr2[i2] = q5t0Var.a + i8 + iArr2[i2];
            }
            i2 = i6;
        }
        return rih1.a;
    }
}
