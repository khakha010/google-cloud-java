// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface StoredInfoTypeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.StoredInfoType)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Resource name.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Current version of the stored info type.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StoredInfoTypeVersion current_version = 2;</code>
   */
  boolean hasCurrentVersion();
  /**
   *
   *
   * <pre>
   * Current version of the stored info type.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StoredInfoTypeVersion current_version = 2;</code>
   */
  com.google.privacy.dlp.v2.StoredInfoTypeVersion getCurrentVersion();
  /**
   *
   *
   * <pre>
   * Current version of the stored info type.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StoredInfoTypeVersion current_version = 2;</code>
   */
  com.google.privacy.dlp.v2.StoredInfoTypeVersionOrBuilder getCurrentVersionOrBuilder();

  /**
   *
   *
   * <pre>
   * Pending versions of the stored info type. Empty if no versions are
   * pending.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.StoredInfoTypeVersion pending_versions = 3;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.StoredInfoTypeVersion> getPendingVersionsList();
  /**
   *
   *
   * <pre>
   * Pending versions of the stored info type. Empty if no versions are
   * pending.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.StoredInfoTypeVersion pending_versions = 3;</code>
   */
  com.google.privacy.dlp.v2.StoredInfoTypeVersion getPendingVersions(int index);
  /**
   *
   *
   * <pre>
   * Pending versions of the stored info type. Empty if no versions are
   * pending.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.StoredInfoTypeVersion pending_versions = 3;</code>
   */
  int getPendingVersionsCount();
  /**
   *
   *
   * <pre>
   * Pending versions of the stored info type. Empty if no versions are
   * pending.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.StoredInfoTypeVersion pending_versions = 3;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.StoredInfoTypeVersionOrBuilder>
      getPendingVersionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Pending versions of the stored info type. Empty if no versions are
   * pending.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.StoredInfoTypeVersion pending_versions = 3;</code>
   */
  com.google.privacy.dlp.v2.StoredInfoTypeVersionOrBuilder getPendingVersionsOrBuilder(int index);
}
