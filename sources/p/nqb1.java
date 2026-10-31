package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nqb1 {
    public final int a;
    public final ArrayList b = new ArrayList();
    public final int c;

    public nqb1(Context context, XmlResourceParser xmlResourceParser) {
        this.c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), inz0.q);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = typedArrayObtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.c);
                this.c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(oqb1 oqb1Var) {
        this.b.add(oqb1Var);
    }

    public final int b(float f, float f2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return -1;
            }
            oqb1 oqb1Var = (oqb1) arrayList.get(i);
            float f3 = oqb1Var.d;
            float f4 = oqb1Var.c;
            float f5 = oqb1Var.b;
            float f6 = oqb1Var.a;
            if ((Float.isNaN(f6) || f >= f6) && ((Float.isNaN(f5) || f2 >= f5) && ((Float.isNaN(f4) || f <= f4) && (Float.isNaN(f3) || f2 <= f3)))) {
                return i;
            }
            i++;
        }
    }
}
