package p;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class lyc implements qka0, Serializable, q6b0 {
    public static final Object NO_RECEIVER = kyc.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient qka0 reflected;
    private final String signature;

    public lyc(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // p.qka0
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // p.qka0
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public qka0 compute() {
        qka0 qka0Var = this.reflected;
        if (qka0Var != null) {
            return qka0Var;
        }
        qka0 qka0VarComputeReflected = computeReflected();
        this.reflected = qka0VarComputeReflected;
        return qka0VarComputeReflected;
    }

    public abstract qka0 computeReflected();

    @Override // p.q6b0
    public GenericDeclaration findJavaDeclaration() {
        return f3o1.k(getOwner(), getSignature());
    }

    @Override // p.pka0
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // p.qka0
    public String getName() {
        return this.name;
    }

    public kla0 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? rc11.a.c(cls) : rc11.a.b(cls);
    }

    @Override // p.qka0
    public List<hc11> getParameters() {
        return getReflected().getParameters();
    }

    public abstract qka0 getReflected();

    @Override // p.qka0
    public oma0 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // p.qka0
    public List<qma0> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // p.qka0
    public xma0 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // p.qka0
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // p.qka0
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // p.qka0
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // p.qka0
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
