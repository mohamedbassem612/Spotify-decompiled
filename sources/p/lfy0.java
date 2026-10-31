package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lfy0 extends xe40 implements u2j0 {
    public final /* synthetic */ byte b;
    public int c;
    public List d;

    public /* synthetic */ lfy0(byte b) {
        this.b = b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException */
    @Override // p.xe40
    public final t8 a() throws UninitializedMessageException {
        switch (this.b) {
            case 0:
                mfy0 mfy0VarE = e();
                if (mfy0VarE.isInitialized()) {
                    return mfy0VarE;
                }
                throw new UninitializedMessageException();
            case 1:
                kgy0 kgy0VarG = g();
                if (kgy0VarG.isInitialized()) {
                    return kgy0VarG;
                }
                throw new UninitializedMessageException();
            case 2:
                ehy0 ehy0VarI = i();
                if (ehy0VarI.isInitialized()) {
                    return ehy0VarI;
                }
                throw new UninitializedMessageException();
            default:
                mgy0 mgy0VarH = h();
                if (mgy0VarH.isInitialized()) {
                    return mgy0VarH;
                }
                throw new UninitializedMessageException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0020  */
    /* JADX WARN: Code duplicated, block: B:54:0x007a  */
    @Override // p.xe40
    public final xe40 b(mwg mwgVar, vz00 vz00Var) throws Throwable {
        ehy0 ehy0Var = null;
        mgy0 mgy0Var = null;
        mfy0 mfy0Var = null;
        kgy0 kgy0Var = null;
        try {
            try {
                switch (this.b) {
                    case 0:
                        try {
                            try {
                                mfy0.f.getClass();
                                j(new mfy0(mwgVar, vz00Var));
                                return this;
                            } catch (InvalidProtocolBufferException e) {
                                mfy0 mfy0Var2 = (mfy0) e.a;
                                try {
                                    throw e;
                                } catch (Throwable th) {
                                    th = th;
                                    mfy0Var = mfy0Var2;
                                    if (mfy0Var != null) {
                                        j(mfy0Var);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (mfy0Var != null) {
                                j(mfy0Var);
                            }
                            throw th;
                        }
                    case 1:
                        try {
                            kgy0.f.getClass();
                            k(new kgy0(mwgVar, vz00Var));
                            return this;
                        } catch (InvalidProtocolBufferException e2) {
                            kgy0 kgy0Var2 = (kgy0) e2.a;
                            try {
                                throw e2;
                            } catch (Throwable th3) {
                                th = th3;
                                kgy0Var = kgy0Var2;
                                if (kgy0Var != null) {
                                    k(kgy0Var);
                                }
                                throw th;
                            }
                        }
                    case 2:
                        try {
                            ehy0.f.getClass();
                            n(new ehy0(mwgVar, vz00Var));
                            return this;
                        } catch (InvalidProtocolBufferException e3) {
                            ehy0 ehy0Var2 = (ehy0) e3.a;
                            try {
                                throw e3;
                            } catch (Throwable th4) {
                                th = th4;
                                ehy0Var = ehy0Var2;
                                if (ehy0Var != null) {
                                    n(ehy0Var);
                                }
                                throw th;
                            }
                        }
                    default:
                        try {
                            try {
                                mgy0.f.getClass();
                                l(new mgy0(mwgVar));
                                return this;
                            } catch (InvalidProtocolBufferException e4) {
                                mgy0 mgy0Var2 = (mgy0) e4.a;
                                try {
                                    throw e4;
                                } catch (Throwable th5) {
                                    th = th5;
                                    mgy0Var = mgy0Var2;
                                    if (mgy0Var != null) {
                                        l(mgy0Var);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            if (mgy0Var != null) {
                                l(mgy0Var);
                            }
                            throw th;
                        }
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    public final Object clone() {
        switch (this.b) {
            case 0:
                lfy0 lfy0Var = new lfy0((byte) 0);
                lfy0Var.d = Collections.EMPTY_LIST;
                lfy0Var.j(e());
                return lfy0Var;
            case 1:
                lfy0 lfy0Var2 = new lfy0((byte) 1);
                lfy0Var2.d = Collections.EMPTY_LIST;
                lfy0Var2.k(g());
                return lfy0Var2;
            case 2:
                lfy0 lfy0Var3 = new lfy0((byte) 2);
                lfy0Var3.d = Collections.EMPTY_LIST;
                lfy0Var3.n(i());
                return lfy0Var3;
            default:
                lfy0 lfy0Var4 = new lfy0((byte) 3);
                lfy0Var4.d = jvb0.b;
                lfy0Var4.l(h());
                return lfy0Var4;
        }
    }

    @Override // p.xe40
    public final /* bridge */ /* synthetic */ xe40 d(kf40 kf40Var) {
        switch (this.b) {
            case 0:
                j((mfy0) kf40Var);
                break;
            case 1:
                k((kgy0) kf40Var);
                break;
            case 2:
                n((ehy0) kf40Var);
                break;
            default:
                l((mgy0) kf40Var);
                break;
        }
        return this;
    }

    public mfy0 e() {
        mfy0 mfy0Var = new mfy0(this);
        if ((this.c & 1) == 1) {
            this.d = Collections.unmodifiableList(this.d);
            this.c &= -2;
        }
        mfy0Var.b = this.d;
        return mfy0Var;
    }

    public kgy0 g() {
        kgy0 kgy0Var = new kgy0(this);
        if ((this.c & 1) == 1) {
            this.d = Collections.unmodifiableList(this.d);
            this.c &= -2;
        }
        kgy0Var.b = this.d;
        return kgy0Var;
    }

    public mgy0 h() {
        mgy0 mgy0Var = new mgy0(this);
        if ((this.c & 1) == 1) {
            this.d = ((ovb0) this.d).g();
            this.c &= -2;
        }
        mgy0Var.b = (ovb0) this.d;
        return mgy0Var;
    }

    public ehy0 i() {
        ehy0 ehy0Var = new ehy0(this);
        if ((this.c & 1) == 1) {
            this.d = Collections.unmodifiableList(this.d);
            this.c &= -2;
        }
        ehy0Var.b = this.d;
        return ehy0Var;
    }

    public void j(mfy0 mfy0Var) {
        if (mfy0Var == mfy0.e) {
            return;
        }
        if (!mfy0Var.b.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d = mfy0Var.b;
                this.c &= -2;
            } else {
                if ((this.c & 1) != 1) {
                    this.d = new ArrayList(this.d);
                    this.c |= 1;
                }
                this.d.addAll(mfy0Var.b);
            }
        }
        this.a = this.a.c(mfy0Var.a);
    }

    public void k(kgy0 kgy0Var) {
        if (kgy0Var == kgy0.e) {
            return;
        }
        if (!kgy0Var.b.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d = kgy0Var.b;
                this.c &= -2;
            } else {
                if ((this.c & 1) != 1) {
                    this.d = new ArrayList(this.d);
                    this.c |= 1;
                }
                this.d.addAll(kgy0Var.b);
            }
        }
        this.a = this.a.c(kgy0Var.a);
    }

    public void l(mgy0 mgy0Var) {
        if (mgy0Var == mgy0.e) {
            return;
        }
        if (!mgy0Var.b.isEmpty()) {
            if (((ovb0) this.d).isEmpty()) {
                this.d = mgy0Var.b;
                this.c &= -2;
            } else {
                if ((this.c & 1) != 1) {
                    this.d = new jvb0((ovb0) this.d);
                    this.c |= 1;
                }
                ((ovb0) this.d).addAll(mgy0Var.b);
            }
        }
        this.a = this.a.c(mgy0Var.a);
    }

    public void n(ehy0 ehy0Var) {
        if (ehy0Var == ehy0.e) {
            return;
        }
        if (!ehy0Var.b.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d = ehy0Var.b;
                this.c &= -2;
            } else {
                if ((this.c & 1) != 1) {
                    this.d = new ArrayList(this.d);
                    this.c |= 1;
                }
                this.d.addAll(ehy0Var.b);
            }
        }
        this.a = this.a.c(ehy0Var.a);
    }
}
