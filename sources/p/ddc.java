package p;

import android.content.Context;
import android.content.res.TypedArray;
import app.p000rive.semantics.SemanticState;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ddc implements Function0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ddc(int i, String str, q0z q0zVar) {
        this.b = i;
        this.c = str;
        this.d = q0zVar;
    }

    public final Object invoke() throws IOException {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        int i = this.b;
        switch (b) {
            case 0:
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(((Context) obj2).getResources().openRawResource(((TypedArray) obj).getResourceId(i, 0)), nne.a), SemanticState.Multiline);
                try {
                    List listK0 = z561.k0(z561.R(new hjc0(bufferedReader)));
                    bufferedReader.close();
                    List list = listK0;
                    ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        List listQ0 = ihc1.Q0((String) it.next(), new String[]{","}, 0, 6);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : listQ0) {
                            if (xhh1.a((String) obj3)) {
                                arrayList2.add(obj3);
                            }
                        }
                        arrayList.add(o7h.l1(arrayList2));
                    }
                    ArrayList<List> arrayList3 = new ArrayList();
                    for (Object obj4 : arrayList) {
                        if (!((List) obj4).isEmpty()) {
                            arrayList3.add(obj4);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                    for (List list2 : arrayList3) {
                        arrayList4.add(new p5x((String) o7h.q0(list2), o7h.k0(list2, 1)));
                    }
                    return arrayList4;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        u890.p(bufferedReader, th);
                        throw th2;
                    }
                }
            default:
                String str = (String) obj2;
                q0z q0zVar = (q0z) obj;
                h661[] h661VarArr = new h661[i];
                for (int i2 = 0; i2 < i; i2++) {
                    h661VarArr[i2] = omo1.l(str + '.' + ((m0v0) q0zVar).e[i2], uic1.j, new h661[0]);
                }
                return h661VarArr;
        }
    }

    public /* synthetic */ ddc(Context context, TypedArray typedArray, int i) {
        this.c = context;
        this.d = typedArray;
        this.b = i;
    }
}
