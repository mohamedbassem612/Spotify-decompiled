package com.spotify.esperanto.esperanto;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.Metadata;
import p.cy30;
import p.gvg;
import p.l1d;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/spotify/esperanto/esperanto/MethodDescriptor;", "", "inputType", "", "outputType", "methodName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getInputType", "()Ljava/lang/String;", "getOutputType", "getMethodName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "src_main_java_com_spotify_esperanto_esperanto-esperanto_kt-api"}, k = 1, mv = {2, 3, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public final /* data */ class MethodDescriptor {
    private final String inputType;
    private final String methodName;
    private final String outputType;

    public MethodDescriptor(String str, String str2, String str3) {
        this.inputType = str;
        this.outputType = str2;
        this.methodName = str3;
    }

    public static /* synthetic */ MethodDescriptor copy$default(MethodDescriptor methodDescriptor, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = methodDescriptor.inputType;
        }
        if ((i & 2) != 0) {
            str2 = methodDescriptor.outputType;
        }
        if ((i & 4) != 0) {
            str3 = methodDescriptor.methodName;
        }
        return methodDescriptor.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getInputType() {
        return this.inputType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOutputType() {
        return this.outputType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMethodName() {
        return this.methodName;
    }

    public final MethodDescriptor copy(String inputType, String outputType, String methodName) {
        return new MethodDescriptor(inputType, outputType, methodName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MethodDescriptor)) {
            return false;
        }
        MethodDescriptor methodDescriptor = (MethodDescriptor) other;
        return u890.j(this.inputType, methodDescriptor.inputType) && u890.j(this.outputType, methodDescriptor.outputType) && u890.j(this.methodName, methodDescriptor.methodName);
    }

    public final String getInputType() {
        return this.inputType;
    }

    public final String getMethodName() {
        return this.methodName;
    }

    public final String getOutputType() {
        return this.outputType;
    }

    public int hashCode() {
        return this.methodName.hashCode() + cy30.d(this.inputType.hashCode() * 31, 31, this.outputType);
    }

    public String toString() {
        return l1d.n(this.methodName, ")", gvg.n("MethodDescriptor(inputType=", this.inputType, ", outputType=", this.outputType, ", methodName="));
    }
}
