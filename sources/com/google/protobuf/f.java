package com.google.protobuf;

import p.l220;
import p.xz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f extends xz00 {
    @Override // p.xz00
    public final l220 c(Object obj) {
        return ((GeneratedMessageLite$ExtendableMessage) obj).a;
    }

    @Override // p.xz00
    public final l220 d(Object obj) {
        GeneratedMessageLite$ExtendableMessage generatedMessageLite$ExtendableMessage = (GeneratedMessageLite$ExtendableMessage) obj;
        l220 l220Var = generatedMessageLite$ExtendableMessage.a;
        if (!l220Var.b) {
            return l220Var;
        }
        l220 l220VarClone = l220Var.clone();
        generatedMessageLite$ExtendableMessage.a = l220VarClone;
        return l220VarClone;
    }

    @Override // p.xz00
    public final void f(Object obj) {
        ((GeneratedMessageLite$ExtendableMessage) obj).a.j();
    }
}
