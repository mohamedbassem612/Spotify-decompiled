package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class rne {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public ArrayList i;

    public final void a() {
        rg70 rg70Var;
        rg70 rg70Var2;
        ArrayList<rg70> arrayList = this.i;
        if (arrayList == null) {
            return;
        }
        this.a = -3.4028235E38f;
        this.b = Float.MAX_VALUE;
        this.c = -3.4028235E38f;
        this.d = Float.MAX_VALUE;
        for (rg70 rg70Var3 : arrayList) {
            if (this.a < ((u8a) rg70Var3).f148p) {
                this.a = ((u8a) rg70Var3).f148p;
            }
            float f = this.b;
            u8a u8aVar = (u8a) rg70Var3;
            float f2 = u8aVar.q;
            if (f > f2) {
                this.b = f2;
            }
            float f3 = this.c;
            float f4 = u8aVar.r;
            if (f3 < f4) {
                this.c = f4;
            }
            float f5 = this.d;
            float f6 = u8aVar.s;
            if (f5 > f6) {
                this.d = f6;
            }
            if (((u8a) rg70Var3).d == 1) {
                float f7 = this.e;
                float f8 = u8aVar.f148p;
                if (f7 < f8) {
                    this.e = f8;
                }
                if (this.f > f2) {
                    this.f = f2;
                }
            } else {
                float f9 = this.g;
                float f10 = u8aVar.f148p;
                if (f9 < f10) {
                    this.g = f10;
                }
                if (this.h > f2) {
                    this.h = f2;
                }
            }
        }
        this.e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.g = -3.4028235E38f;
        this.h = Float.MAX_VALUE;
        Iterator it = arrayList.iterator();
        do {
            rg70Var = null;
            if (!it.hasNext()) {
                rg70Var2 = null;
                break;
            }
            rg70Var2 = (rg70) it.next();
        } while (((u8a) rg70Var2).d != 1);
        if (rg70Var2 != null) {
            u8a u8aVar2 = (u8a) rg70Var2;
            this.e = u8aVar2.f148p;
            this.f = u8aVar2.q;
            for (rg70 rg70Var4 : arrayList) {
                if (((u8a) rg70Var4).d == 1) {
                    u8a u8aVar3 = (u8a) rg70Var4;
                    float f11 = u8aVar3.q;
                    if (f11 < this.f) {
                        this.f = f11;
                    }
                    float f12 = u8aVar3.f148p;
                    if (f12 > this.e) {
                        this.e = f12;
                    }
                }
            }
        }
        for (rg70 rg70Var5 : arrayList) {
            if (((u8a) rg70Var5).d == 2) {
                rg70Var = rg70Var5;
                break;
            }
        }
        if (rg70Var != null) {
            u8a u8aVar4 = (u8a) rg70Var;
            this.g = u8aVar4.f148p;
            this.h = u8aVar4.q;
            for (rg70 rg70Var6 : arrayList) {
                if (((u8a) rg70Var6).d == 2) {
                    u8a u8aVar5 = (u8a) rg70Var6;
                    float f13 = u8aVar5.q;
                    if (f13 < this.h) {
                        this.h = f13;
                    }
                    float f14 = u8aVar5.f148p;
                    if (f14 > this.g) {
                        this.g = f14;
                    }
                }
            }
        }
    }

    public final rg70 b(int i) {
        ArrayList arrayList = this.i;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return (rg70) arrayList.get(i);
    }

    public final int c() {
        ArrayList arrayList = this.i;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final int d() {
        Iterator it = this.i.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((u8a) ((rg70) it.next())).o.size();
        }
        return size;
    }

    public final float e(int i) {
        if (i == 1) {
            float f = this.e;
            return f == -3.4028235E38f ? this.g : f;
        }
        float f2 = this.g;
        return f2 == -3.4028235E38f ? this.e : f2;
    }

    public final float f(int i) {
        if (i == 1) {
            float f = this.f;
            return f == Float.MAX_VALUE ? this.h : f;
        }
        float f2 = this.h;
        return f2 == Float.MAX_VALUE ? this.f : f2;
    }
}
