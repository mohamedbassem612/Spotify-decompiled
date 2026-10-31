package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vnn implements d6o0 {
    public final t24 a;
    public int b = 1;
    public float c;

    public vnn(t24 t24Var) {
        this.a = t24Var;
    }

    public final long M(int i, long j) {
        if (this.b != 2) {
            return 0L;
        }
        a(j);
        return j;
    }

    public final Object Q0(long j, long j2, lnm lnmVar) {
        this.b = 1;
        this.c = 0.0f;
        return new qui1(0L);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final long a(long j) {
        float fIntBitsToFloat;
        int i;
        if (this.c > 0.0f) {
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i2) > 0.0f) {
                fIntBitsToFloat = Float.intBitsToFloat(i2) - this.c;
                if (fIntBitsToFloat < 0.0f) {
                    fIntBitsToFloat = 0.0f;
                }
            } else if (this.c < 0.0f) {
                i = (int) (j & 4294967295L);
                if (Float.intBitsToFloat(i) < 0.0f) {
                    fIntBitsToFloat = Float.intBitsToFloat(i) - this.c;
                    if (fIntBitsToFloat > 0.0f) {
                        fIntBitsToFloat = 0.0f;
                    }
                } else {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
                }
            } else {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
            }
        } else if (this.c < 0.0f) {
            i = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i) < 0.0f) {
                fIntBitsToFloat = Float.intBitsToFloat(i) - this.c;
                if (fIntBitsToFloat > 0.0f) {
                    fIntBitsToFloat = 0.0f;
                }
            } else {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
            }
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        float fB = this.a.b(fIntBitsToFloat);
        this.c -= Float.intBitsToFloat((int) (j & 4294967295L)) - fB;
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L);
    }

    public final long h0(int i, long j, long j2) {
        if (this.b != 3) {
            if (Float.intBitsToFloat((int) (j & 4294967295L)) != 0.0f) {
                this.b = 3;
                return 0L;
            }
            if (Float.intBitsToFloat((int) (j2 & 4294967295L)) != 0.0f) {
                this.b = 2;
                return a(j2);
            }
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k0(long j, lnm lnmVar) {
        unn unnVar;
        if (lnmVar instanceof unn) {
            unnVar = (unn) lnmVar;
            int i = unnVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                unnVar.d = i - Integer.MIN_VALUE;
            } else {
                unnVar = new unn(this, (onm) lnmVar);
            }
        } else {
            unnVar = new unn(this, (onm) lnmVar);
        }
        Object obj = unnVar.b;
        int i2 = unnVar.d;
        if (i2 == 0) {
            hm5.M(obj);
            if (this.b == 2) {
                float fE = qui1.e(j);
                unnVar.a = j;
                unnVar.d = 1;
                Object objH = this.a.h(fE, unnVar);
                d9n d9nVar = d9n.a;
                if (objH == d9nVar) {
                    return d9nVar;
                }
            } else {
                j = 0;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = unnVar.a;
            hm5.M(obj);
        }
        return new qui1(j);
    }
}
