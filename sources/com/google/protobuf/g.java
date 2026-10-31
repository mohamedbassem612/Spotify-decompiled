package com.google.protobuf;

import java.io.IOException;
import p.bhn0;
import p.hhg1;
import p.l36;
import p.lwg;
import p.oiy0;
import p.r8;
import p.sm41;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class g extends r8 {
    private final h defaultInstance;
    protected h instance;

    public g(h hVar) {
        this.defaultInstance = hVar;
        if (hVar.isMutable()) {
            hhg1.n("Default instance must be immutable.");
            throw null;
        }
        this.instance = hVar.newMutableInstance();
    }

    @Override // p.r2j0
    public final h build() {
        h hVarBuildPartial = buildPartial();
        if (hVarBuildPartial.isInitialized()) {
            return hVarBuildPartial;
        }
        throw r8.newUninitializedMessageException(hVarBuildPartial);
    }

    @Override // p.r2j0
    public h buildPartial() {
        boolean zIsMutable = this.instance.isMutable();
        h hVar = this.instance;
        if (!zIsMutable) {
            return hVar;
        }
        hVar.makeImmutable();
        return this.instance;
    }

    @Override // 
    /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] */
    public final g mo0clear() {
        if (this.defaultInstance.isMutable()) {
            hhg1.n("Default instance must be immutable.");
            return null;
        }
        this.instance = this.defaultInstance.newMutableInstance();
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public g mo3clone() {
        g gVarNewBuilderForType = getDefaultInstanceForType().newBuilderForType();
        gVarNewBuilderForType.instance = buildPartial();
        return gVarNewBuilderForType;
    }

    public final void copyOnWrite() {
        if (this.instance.isMutable()) {
            return;
        }
        copyOnWriteInternal();
    }

    public void copyOnWriteInternal() {
        h hVarNewMutableInstance = this.defaultInstance.newMutableInstance();
        h hVar = this.instance;
        oiy0 oiy0Var = oiy0.c;
        oiy0Var.getClass();
        oiy0Var.a(hVarNewMutableInstance.getClass()).d(hVarNewMutableInstance, hVar);
        this.instance = hVarNewMutableInstance;
    }

    @Override // p.v2j0
    public final boolean isInitialized() {
        return h.k(this.instance, false);
    }

    @Override // p.r8, p.r2j0
    public g mergeFrom(lwg lwgVar, uz00 uz00Var) throws IOException {
        copyOnWrite();
        try {
            oiy0 oiy0Var = oiy0.c;
            h hVar = this.instance;
            oiy0Var.getClass();
            sm41 sm41VarA = oiy0Var.a(hVar.getClass());
            h hVar2 = this.instance;
            e eVar = lwgVar.c;
            if (eVar == null) {
                eVar = new e(lwgVar);
            }
            sm41VarA.j(hVar2, eVar, uz00Var);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    @Override // p.v2j0
    public h getDefaultInstanceForType() {
        return this.defaultInstance;
    }

    @Override // p.r8
    public g internalMergeFrom(h hVar) {
        return mergeFrom(hVar);
    }

    public g mergeFrom(h hVar) {
        if (getDefaultInstanceForType().equals(hVar)) {
            return this;
        }
        copyOnWrite();
        h hVar2 = this.instance;
        oiy0 oiy0Var = oiy0.c;
        oiy0Var.getClass();
        oiy0Var.a(hVar2.getClass()).d(hVar2, hVar);
        return this;
    }

    @Override // p.r8
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public g mo5mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) throws InvalidProtocolBufferException {
        copyOnWrite();
        try {
            oiy0 oiy0Var = oiy0.c;
            h hVar = this.instance;
            oiy0Var.getClass();
            oiy0Var.a(hVar.getClass()).i(this.instance, bArr, i, i + i2, new l36(uz00Var));
            return this;
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e2) {
            bhn0.o("Reading from byte array should not throw IOException.", e2);
            return null;
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.h();
        }
    }

    @Override // p.r8
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public g mo4mergeFrom(byte[] bArr, int i, int i2) {
        return mo5mergeFrom(bArr, i, i2, uz00.a());
    }
}
