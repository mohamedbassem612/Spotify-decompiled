package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h441 extends onm implements vr20 {
    public final vr20 a;
    public final o8n b;
    public final int c;
    public o8n d;
    public lnm e;

    public h441(vr20 vr20Var, o8n o8nVar) {
        super(myh.c, o6x.a);
        this.a = vr20Var;
        this.b = o8nVar;
        this.c = ((Number) o8nVar.o(0, new llj((byte) 11))).intValue();
    }

    public final Object e(lnm lnmVar, Object obj) {
        o8n context = lnmVar.getContext();
        op71.x(context);
        o8n o8nVar = this.d;
        if (o8nVar != context) {
            if (o8nVar instanceof o3v) {
                k220.f(jhc1.J("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((o3v) o8nVar).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "));
                return null;
            }
            ot11.x(this, context);
            this.d = context;
        }
        this.e = lnmVar;
        Object objInvoke = j441.a.invoke(this.a, obj, this);
        if (!u890.j(objInvoke, d9n.a)) {
            this.e = null;
        }
        return objInvoke;
    }

    @Override // p.vr20
    public final Object emit(Object obj, lnm lnmVar) {
        try {
            Object objE = e(lnmVar, obj);
            return objE == d9n.a ? objE : rih1.a;
        } catch (Throwable th) {
            this.d = new o3v(th, lnmVar.getContext());
            throw th;
        }
    }

    @Override // p.faa, p.e9n
    public final e9n getCallerFrame() {
        lnm lnmVar = this.e;
        if (lnmVar instanceof e9n) {
            return (e9n) lnmVar;
        }
        return null;
    }

    @Override // p.onm, p.lnm
    public final o8n getContext() {
        o8n o8nVar = this.d;
        return o8nVar == null ? o6x.a : o8nVar;
    }

    @Override // p.faa
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        Throwable thA = e331.a(obj);
        if (thA != null) {
            this.d = new o3v(thA, getContext());
        }
        lnm lnmVar = this.e;
        if (lnmVar != null) {
            lnmVar.resumeWith(obj);
        }
        return d9n.a;
    }
}
