package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import com.comscore.streaming.WindowState;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hnm0 {
    public final int a;
    public final boolean b;
    public int c;
    public int d;
    public int e;
    public String f;
    public int g;
    public int h;
    public final float i;
    public final inm0 j;
    public final ArrayList k;
    public eif1 l;
    public final ArrayList m;
    public final int n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f64p;
    public final int q;
    public final int r;

    public hnm0(inm0 inm0Var, Context context, XmlResourceParser xmlResourceParser) {
        this.a = -1;
        this.b = false;
        this.c = -1;
        this.d = -1;
        this.e = 0;
        this.f = null;
        this.g = -1;
        this.h = WindowState.NORMAL;
        this.i = 0.0f;
        this.k = new ArrayList();
        this.l = null;
        this.m = new ArrayList();
        this.n = 0;
        this.o = false;
        this.f64p = -1;
        this.r = 0;
        int i = inm0Var.j;
        SparseArray sparseArray = inm0Var.g;
        this.h = i;
        this.q = inm0Var.k;
        this.j = inm0Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), inz0.t);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 2) {
                this.c = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                if ("layout".equals(resourceTypeName)) {
                    kil kilVar = new kil();
                    kilVar.n(context, this.c);
                    sparseArray.append(this.c, kilVar);
                } else if ("xml".equals(resourceTypeName)) {
                    this.c = inm0Var.i(context, this.c);
                }
            } else if (index == 3) {
                this.d = typedArrayObtainStyledAttributes.getResourceId(index, this.d);
                String resourceTypeName2 = context.getResources().getResourceTypeName(this.d);
                if ("layout".equals(resourceTypeName2)) {
                    kil kilVar2 = new kil();
                    kilVar2.n(context, this.d);
                    sparseArray.append(this.d, kilVar2);
                } else if ("xml".equals(resourceTypeName2)) {
                    this.d = inm0Var.i(context, this.d);
                }
            } else if (index == 6) {
                int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i3 == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.g = resourceId;
                    if (resourceId != -1) {
                        this.e = -2;
                    }
                } else if (i3 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f = string;
                    if (string != null) {
                        if (string.indexOf("/") > 0) {
                            this.g = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.e = -2;
                        } else {
                            this.e = -1;
                        }
                    }
                } else {
                    this.e = typedArrayObtainStyledAttributes.getInteger(index, this.e);
                }
            } else if (index == 4) {
                int i4 = typedArrayObtainStyledAttributes.getInt(index, this.h);
                this.h = i4;
                if (i4 < 8) {
                    this.h = 8;
                }
            } else if (index == 8) {
                this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
            } else if (index == 1) {
                this.n = typedArrayObtainStyledAttributes.getInteger(index, this.n);
            } else if (index == 0) {
                this.a = typedArrayObtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == 9) {
                this.o = typedArrayObtainStyledAttributes.getBoolean(index, this.o);
            } else if (index == 7) {
                this.f64p = typedArrayObtainStyledAttributes.getInteger(index, -1);
            } else if (index == 5) {
                this.q = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 10) {
                this.r = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        if (this.d == -1) {
            this.b = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public hnm0(inm0 inm0Var, int i) {
        this.a = -1;
        this.b = false;
        this.c = -1;
        this.d = -1;
        this.e = 0;
        this.f = null;
        this.g = -1;
        this.h = WindowState.NORMAL;
        this.i = 0.0f;
        this.k = new ArrayList();
        this.l = null;
        this.m = new ArrayList();
        this.n = 0;
        this.o = false;
        this.f64p = -1;
        this.q = 0;
        this.r = 0;
        this.a = -1;
        this.j = inm0Var;
        this.d = 2131431622;
        this.c = i;
        this.h = inm0Var.j;
        this.q = inm0Var.k;
    }

    public hnm0(inm0 inm0Var, hnm0 hnm0Var) {
        this.a = -1;
        this.b = false;
        this.c = -1;
        this.d = -1;
        this.e = 0;
        this.f = null;
        this.g = -1;
        this.h = WindowState.NORMAL;
        this.i = 0.0f;
        this.k = new ArrayList();
        this.l = null;
        this.m = new ArrayList();
        this.n = 0;
        this.o = false;
        this.f64p = -1;
        this.q = 0;
        this.r = 0;
        this.j = inm0Var;
        this.h = inm0Var.j;
        if (hnm0Var != null) {
            this.f64p = hnm0Var.f64p;
            this.e = hnm0Var.e;
            this.f = hnm0Var.f;
            this.g = hnm0Var.g;
            this.h = hnm0Var.h;
            this.k = hnm0Var.k;
            this.i = hnm0Var.i;
            this.q = hnm0Var.q;
        }
    }
}
