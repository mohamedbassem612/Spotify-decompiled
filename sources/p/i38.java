package p;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i38 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ ty60 c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i38(ty60 ty60Var, Object obj, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.c = ty60Var;
        this.d = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ty60 ty60Var = this.c;
        switch (b) {
            case 0:
                i38 i38Var = new i38(ty60Var, lnmVar, (byte) 0);
                i38Var.d = obj;
                return i38Var;
            case 1:
                return new i38(ty60Var, this.d, lnmVar);
            default:
                i38 i38Var2 = new i38(ty60Var, lnmVar, (byte) 2);
                i38Var2.d = obj;
                return i38Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((ByteBuffer) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((zu81) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        switch (this.a) {
            case 0:
                vr20 vr20Var = (vr20) this.d;
                d9n d9nVar = d9n.a;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    g38 g38Var = this.c.a;
                    int iA = g38Var.f.get() != null ? 16000 : g38Var.c.a();
                    ByteBuffer byteBufferOrder = ByteBuffer.allocate(44).order(ByteOrder.LITTLE_ENDIAN);
                    Charset charset = nne.a;
                    ByteBuffer byteBufferPutInt = byteBufferOrder.put("RIFF".getBytes(charset)).putInt(-1).put("WAVE".getBytes(charset)).put("fmt ".getBytes(charset)).putInt(16).putShort((short) 1).putShort((short) 1).putInt(iA).putInt(iA * 2).putShort((short) 2).putShort((short) 16).put("data".getBytes(charset)).putInt(-1);
                    byteBufferPutInt.flip();
                    this.d = null;
                    this.b = true;
                    if (vr20Var.emit(byteBufferPutInt, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 1:
                d9n d9nVar2 = d9n.a;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    ty60 ty60Var = this.c;
                    Object obj2 = this.d;
                    WeakHashMap weakHashMap = ty60.q;
                    synchronized (weakHashMap) {
                        z = weakHashMap.get(ty60Var.a) == obj2;
                    }
                    if (z) {
                        g38 g38Var2 = this.c.a;
                        this.b = true;
                        obj = cuo1.D(g38Var2, this);
                        if (obj == d9nVar2) {
                            return d9nVar2;
                        }
                    }
                    return Boolean.valueOf(z);
                }
                if (!z3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                boolean z4 = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(z4);
            default:
                ty60 ty60Var2 = this.c;
                zu81 zu81Var = (zu81) this.d;
                d9n d9nVar3 = d9n.a;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    if ((zu81Var instanceof su81) || (zu81Var instanceof xu81) || (zu81Var instanceof vu81)) {
                        ty60Var2.p = true;
                        ty60Var2.g();
                        this.d = null;
                        this.b = true;
                        if (ty60Var2.a(this) == d9nVar3) {
                            return d9nVar3;
                        }
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i38(ty60 ty60Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = ty60Var;
    }
}
